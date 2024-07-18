/*
Implement the RandomizedSet class:
RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.
 */
class RandomizedSet {
    private ArrayList<Integer> arr;
    private Map<Integer, Integer> map;
    private Random rand = new Random();
    public RandomizedSet() {
        arr = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)) {

            arr.add(val);
            map.put(val, arr.size() - 1);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        int removeIndex = map.get(val);
        arr.set(removeIndex, arr.get(arr.size() - 1));
        map.put(arr.get(removeIndex), removeIndex);
        arr.remove(arr.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}