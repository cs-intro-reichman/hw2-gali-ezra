public class TimeCalc {
    public static void main(String[] args) {
        String time= args[0];
        String minutesToAdd= args[1];

        String minutes= "" + time.charAt(3)+ time.charAt(4);
        String hours= "" + time.charAt(0)+ time.charAt(1);

        int totalMinutes = (Integer.parseInt(hours)*60) +
        Integer.parseInt(minutes) + Integer.parseInt(minutesToAdd);
        int totalHours= totalMinutes/60;
        int newHours= totalHours%24;
        int newNinutes=totalMinutes- (totalHours*60);
        String finalHours= String.valueOf(newHours);
        String finalMinutes=String.valueOf(newNinutes);

        if (newHours < 10)
        {
            finalHours= "0"+newHours;
        }
        if (newNinutes < 10)
        {
            finalMinutes= "0"+ newNinutes;
        }

        String FinalTime= finalHours + ":" + finalMinutes;
        System.out.println(FinalTime);


        /*System.out.println(hours);
        System.out.println(minutes);
        System.out.println(minutesToAdd);
        System.out.println(totalMinutes);
        System.out.println(totalHours);
        System.out.println(newHours);
        System.out.println(newNinutes);*/

    }
}
