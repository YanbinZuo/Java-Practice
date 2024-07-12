package P57P58HashMap.P57HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal<K, V> {
  private ArrayList<LinkedList<Entity>> list;
  private int size = 0;
  private float lf = 0.5f;

  public HashMapFinal() {
    list = new ArrayList<>();
    for(int i=0; i<10; i++) {
      list.add(new LinkedList<>());
    }
  }

  private int getHash(K key) {
    return Math.abs(key.hashCode() % list.size());
  }

  public V get(K key) {
    int hash = getHash(key);
    LinkedList<Entity> entities = list.get(hash);
    for(Entity entity: entities) {
      if(entity.key.equals(key)) {
        return entity.value;
      }
    }
    return null;
  }

  public boolean containsKey(K key) {
    return get(key) != null;
  }

  public void put(K key, V value) {
    int hash = getHash(key);
    LinkedList<Entity> entities = list.get(hash);
    for(Entity entity: entities) {
      if(entity.key.equals(key)) {
        entity.value = value;
        return;
      }
    }

    if((float)(size) / list.size() > lf) {
      reHash();
    }
    entities.add(new Entity(key, value));
    size++;
  }

  private void reHash() {
    System.out.println("We are now rehashing!");

    ArrayList<LinkedList<Entity>> old = list;
    list = new ArrayList<>();
    size = 0;
    for(int i=0; i<old.size() * 2; i++) {
      list.add(new LinkedList<>());
    }
    for(LinkedList<Entity> entities: old) {
      for(Entity entity: entities) {
        put(entity.key, entity.value);
      }
    }
  }

  public void remove(K key) {
    int hash = getHash(key);
    LinkedList<Entity> entities = list.get(hash);
    Entity target = null;
    for(Entity entity: entities) {
      if(entity.key.equals(key)) {
        target = entity;
        // I think should size-- put here
        size--;
        break;
      }
    }

    entities.remove(target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for(LinkedList<Entity> entities: list) {
      for(Entity entity: entities) {
        sb.append(entity.key);
        sb.append(" = ");
        sb.append(entity.value);
        sb.append(", ");
      }
    }
    sb.append(" }");
    return sb.toString();
  }

  private class Entity {
    K key;
    V value;

    public Entity(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}
