/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

/**
 *
 * @author FA22-BSE-027
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      HexaObserver hexaObserver = new HexaObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      BinaryObserver binaryObserver = new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);

      // Detach OctalObserver
      subject.detach(octalObserver);

      System.out.println("Second state change: 10");	
      subject.setState(10);

      // Reattach OctalObserver and detach HexaObserver
      subject.attach(octalObserver);
      subject.detach(hexaObserver);

      System.out.println("Third state change: 5");	
      subject.setState(5);
   }
}
