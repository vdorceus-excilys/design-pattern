public class ThreadSafeSingleton {
  static private volatile ThreadSafeSingleton instance;
  
  private ThreadSafeSingleton() {
  }
  
  public static ThreadSafe getInstance() {
    if( instance == null) {
      synchronized(ThreadSafeSingleton.class) {
        if(instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
