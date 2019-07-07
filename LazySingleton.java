public class LazySingleton {
  static private LazySingleton instance;
  
  private LazySingleton(){
  }
  
  static public LazySingleton getInstance(){
    return (instance == null) ? (instance = new LazySingleton()) : instance;
  }
  
}
