public class Singleton {
  static private final Singleton instance = new Singleton();
  private Singleton(){
  }
  
  static public Singleton getInstance(){
    return Singleton.instance;    
  }
  
 }
  
  

