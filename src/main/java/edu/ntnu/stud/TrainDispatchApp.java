package edu.ntnu.stud;
import java.util.ArrayList;

/**
 * This is the main class for the train dispatch application.
 */
public class TrainDispatchApp {
  private ArrayList<TrainDepature> depatures;

  public TrainDispatchApp() 
  {
    depatures = new ArrayList<TrainDepature>();
  }

  public static void main(String[] args) 
  {
    new TrainDispatchApp();
  }
}
