package hw.vpex.dbase;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */

import java.lang.String;
import java.util.Random;

class Ambulance{
    int id;
    int numbOfDoct;
    String typeOfVicl;
    boolean specIteam;
    int counter;
    int speed;

    public void SetAmbul(int id, int numbOfDoct, String typeOfVicl, boolean specIteam,int speed){
        this.id = id;
        this.numbOfDoct = numbOfDoct;
        this.typeOfVicl = typeOfVicl;
        this.specIteam = specIteam;
        this.speed = speed;
        counter = 0;
    }
}
class PatientInfo{
    int numbOfCall;
    boolean sex;
    boolean complexityOfDesis;
    boolean rareDesis;
    int distance;
    int timeOfActyality;

    final  static Random random = new Random();

    public void SetPatirntInfo(int numbOfCall){
        this.numbOfCall = numbOfCall;
        sex = random.nextBoolean();
        complexityOfDesis = random.nextBoolean();
        if (complexityOfDesis){
            timeOfActyality = random.nextInt(60) + 25;
        }
        else{
            timeOfActyality = random.nextInt(20) + 15;
        }
        rareDesis = random.nextBoolean();
        distance = random.nextInt(100)+10;
    }
}

class ProccessingAndStatistic{
    public void SetAllPacients(){
        int femaleStat = 0;int complStat = 0;int falsStat = 0;int maleStat = 0;
        Random random = new Random();
        Ambulance[] ambulance = new Ambulance[4]; //*** исправлено ***
        ambulance[0] = new Ambulance();
        ambulance[0].SetAmbul(1,2,"A",false,60);
        ambulance[1] = new Ambulance();
        ambulance[1].SetAmbul(2,2,"A",true,55);
        ambulance[2] = new Ambulance();
        ambulance[2].SetAmbul(3,2,"B",false,80);
        ambulance[3] = new Ambulance();
        ambulance[3].SetAmbul(4,2,"B",true,70);
        int events = random.nextInt(50)+10;
        PatientInfo[] pacients = new PatientInfo[events];
        for(int i = 0; i<events;i++){  //*** исправлено ***
            pacients[i] = new PatientInfo();
            pacients[i].SetPatirntInfo(i);//*** исправлено ***
            if (pacients[i].sex){
                femaleStat++;
            }
            else{ maleStat++;}
            if ((pacients[i].complexityOfDesis == true)&&(pacients[i].rareDesis==false)){
                ambulance[0].counter++;
                if (pacients[i].distance/ambulance[0].speed<pacients[i].timeOfActyality)
                    complStat++;
                else
                    falsStat++;
            }
            if ((pacients[i].complexityOfDesis == true)&&(pacients[i].rareDesis==true)){
                ambulance[1].counter++;
                if (pacients[i].distance/ambulance[0].speed<pacients[i].timeOfActyality)
                    complStat++;
                else
                    falsStat++;
            }
            if ((pacients[i].complexityOfDesis == false)&&(pacients[i].rareDesis==false)){
                ambulance[2].counter++;
                if (pacients[i].distance/ambulance[2].speed<pacients[i].timeOfActyality)
                    complStat++;
                else
                    falsStat++;
            }
            else{
                ambulance[3].counter++;
                if (pacients[i].distance/ambulance[0].speed<pacients[i].timeOfActyality)
                    complStat++;
                else
                    falsStat++;
            }
        }
        System.out.println("Выездов машина категории А без спец. оборуд. = " + ambulance[0].counter + "\n"+
                "Выездов машина категории А co спец. оборуд. = " + ambulance[1].counter + "\n"+
                "Выездов машина категории B без спец. оборуд. = " + ambulance[2].counter + "\n"+
                "Выездов машина категории B co спец. оборуд. = " + ambulance[3].counter + "\n");
        System.out.println("Вызовов от мужчин = " + maleStat + "\n" + "Вызовов от женщин = " + femaleStat + "\n" +
                "Всего выездов = " + events + "\n"+"Выезды прошедшие успешно = " + complStat + "\n" +
                "Вызовы прошедшие неудачно = " + falsStat);
    }


}




public class Main {
    public static void main(String[] args) {
        ProccessingAndStatistic statistic = new ProccessingAndStatistic();
        statistic.SetAllPacients();
    }
}
