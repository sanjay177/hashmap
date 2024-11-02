# HashMap Problems

## 1. Design HashMap
### Requirements
* Constructor
* Put Operation
* Get Operation
* Remove Operation

### Note : This implementation does not take care of collision. Collision can be handled in one below ways and can be added in future, but since its simple demonstration hashmap i will keep it out of scope for now
1. Separate Chaining - Instead of storing plain object in array index , we can use list of Node<K, V> , in case of collision additional value will be added in the list. 
2. Open Addressing - Check next available slot if collision occurs