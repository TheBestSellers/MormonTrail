/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.exceptions;

/**
 *
 * @author sariahmudaliar
 */
public class EventControlException extends Exception {

    public EventControlException() {
    }

    public EventControlException(String message) {
        super(message);
    }

    public EventControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public EventControlException(Throwable cause) {
        super(cause);
    }

    public EventControlException(String message, 
            Throwable cause, 
            boolean enableSuppression, 
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
        
}
