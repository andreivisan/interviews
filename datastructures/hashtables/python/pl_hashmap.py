class Bucket:
    def __init__(self):
        self.bucket = []

    def get(self, key):
        for (k, v) in self.bucket:
            if k == key:
                return v
        return None    
    
    def update(self, key, value):
        found = False
        for i, entry in enumerate(self.bucket):
            if key == entry[0]:
                self.bucket[i] = (key, value)
                found = True
                break
        if not found:
            self.bucket.append((key, value))
            
    def remove(self, key):
        for i, entry in enumerate(self.bucket):
            if key == entry[0]:
                del self.bucket[i]
                
                
class PLHashMap(object):
    def __init__(self):
        self.key_space = 2069
        self.hash_table = [Bucket() for i in range(self.key_space)]
        
    def put(self, key, value):
        hash_key = hash(key) % self.key_space
        self.hash_table[hash_key].update(key, value)
        
    def get(self, key):
        hash_key = hash(key) % self.key_space
        return self.hash_table[hash_key].get(key)
    
    def remove(self, key):
        hash_key = hash(key) % self.key_space
        self.hash_table[hash_key].remove(key)
        
        
def main():
    pl_hashmap = PLHashMap()
    
    pl_hashmap.put("A", "abc")
    pl_hashmap.put("B", "bac")
    pl_hashmap.put("C", "cab")
    
    print(f'Value for key "A" is {pl_hashmap.get("A")}')
    print(f'Value for key "B" is {pl_hashmap.get("B")}')
    print(f'Value for key "C" is {pl_hashmap.get("C")}')
    
    
if __name__ == "__main__":
    main()
            