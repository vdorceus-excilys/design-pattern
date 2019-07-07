public class PreInstanciatedBlockSingleton {
  static private final PreInstanciatedBlockSingleton instance;
  
  static {
    instance = new PreInstanciatedBlockSingleton();
  }
  
  private PreInstanciatedBlockSingleton(){
  }
  
}
