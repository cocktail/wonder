// Generated by the WOLips Templateengine Plug-in at Mar 7, 2008 10:03:32 PM
package er.iui.example;

import com.webobjects.foundation.NSLog;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {
  public static void main(String[] argv) {
    ERXApplication.main(argv, Application.class);
  }

  public Application() {
    setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));
    NSLog.out.appendln("Welcome to " + name() + " !");
    /* ** put your initialization code in here ** */
  }
}
