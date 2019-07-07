public class PreInstanciatedSingleton {
  static private final PreInstanciatedSingleton instance = new PreInstanciatedSingleton();
  private Singleton(){
  }
  
  static public PreInstanciatedSingleton getInstance(){
    return Singleton.instance;    
  }
  
 }
  
  

