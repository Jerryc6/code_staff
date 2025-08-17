package BUILD_BUILD_BUILDProject;

import java.util.Scanner;

public class TimeTracker {
    private long startTime;
    private long endTime;
    private boolean isRunning;

    public TimeTracker(){
        this.isRunning = false;
    }

    public void start(){
        if(!isRunning){
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Timer started.");
        }else{
            System.out.println("Timer is already running.");
        }
    }

    public void stop(){
        if(isRunning){
            endTime = System.currentTimeMillis();
            isRunning = false;
            System.out.println("Timer stopped.");
            displayTime();
        }
    }


    private void displayTime(){
        long duration  = endTime - startTime;
        long seconds = (duration / 1000) % 60;
        long minutes = (duration / (1000 * 60)) % 60;
        long hours = (duration / 1000 * 60 * 60) % 24;

        System.out.printf("Time spent: %02d:%02d:%02d\n", hours, minutes, seconds);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeTracker tt = new TimeTracker();
        String comand;

        while (true) {
            System.out.println("\nEnter command (start/stop/exit):");
            comand = sc.nextLine().toLowerCase();

            switch (comand) {
                case "start":
                    tt.start();
                    break;
                case "stop":
                    tt.stop();
                    break;
                case "exit":
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                     System.out.println("Invalid command! Please enter 'start', 'stop', or 'exit'.");
                    break;
            }
        }
    }
}
