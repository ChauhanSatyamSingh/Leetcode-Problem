//Pair
//Bucket
class Pair<U, V> {
    U first;
    V second;
    
    public Pair(U f, V s) {
        first = f;
        second = s;

    }
}

class Bucket {
    List<Pair<Integer, Integer>> list;

    public Bucket() {
        list = new LinkedList<Pair<Integer, Integer>>();
    }

    public void put(int key, int value) {
        for(Pair<Integer,Integer> p: list) {
            if(p.first == key) {
                p.second = value;
                return;
            }
        }

        list.addFirst(new Pair<Integer, Integer> (key, value));
    }

    public int get(int key) {
        for(Pair<Integer, Integer> p: list) {
            if(p.first == key) return p.second;
        }

        return -1;
    }

    public void remove(int key) {
        for(Pair<Integer, Integer> p: list) {
            if(p.first == key) {
                list.remove(p);
                return;
            }
        }
    }
}

class MyHashMap {

    Bucket[] buckets;
    int keyRange = 769;

    public MyHashMap() {
        buckets = new Bucket[keyRange];

        for(int i = 0; i < keyRange; i++) {
            this.buckets[i] = new Bucket();
        }
    }

    public int getBucketIndex(int key) {
        return key % keyRange;
    }
    
    public void put(int key, int value) {
        int bucketIndex = this.getBucketIndex(key);
        this.buckets[bucketIndex].put(key, value);
    }
    
    public int get(int key) {
        int bucketIndex = this.getBucketIndex(key);
        return this.buckets[bucketIndex].get(key); 
    }
    
    public void remove(int key) {
        int bucketIndex = this.getBucketIndex(key);
        this.buckets[bucketIndex].remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */