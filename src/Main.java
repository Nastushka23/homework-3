public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1(){
        System.out.println("Задача 1");
        byte a=57;
        System.out.println("Значение переменной a с типом byte равно "+a);
        short b=138;
        System.out.println("Значение переменной b с типом short равно "+b);
        int c=33800;
        System.out.println("Значение переменной c с типом int равно "+c);
        long d=1111111111111L;
        System.out.println("Значение переменной d с типом long равно "+d);
        float e=1.5f;
        System.out.println("Значение переменной f с типом float равно "+e);
        double f=1.0001236;
        System.out.println("Значение переменной f с типом double равно "+f);
    }
    public static void task2 (){
        System.out.println("Задача 2");
        float a=27.12f;
        System.out.println(a);
        long b=987678965549L;
        System.out.println(b);
        float c=2.786f;
        System.out.println(c);
        short d=569;
        System.out.println(d);
        short e=-159;
        System.out.println(e);
        short f=27897;
        System.out.println(f);
        byte g=67;
        System.out.println(g);

    }
    public static void task3(){
        System.out.println("Задача 3");
        byte aP=23;
        byte aS=27;
        byte eA=30;
        int students=aP+aS+eA;
        short sheetsPaper=480;
        int sheetPupil=sheetsPaper/students;
        System.out.println("На каждого ученика рассчитано " +sheetPupil+ " листов бумаги");

    }
    public static void task4(){
        System.out.println("Задача 4");
        byte performanceSpeed=8;
        int aBottles=performanceSpeed*20;
        System.out.println("За 20 мин машина призвела "+aBottles+" штук бутылок");
        int bBottles=performanceSpeed*1440;
        System.out.println("За сутки машина призвела "+bBottles+" штук бутылок");
        int cBottles=bBottles*3;
        System.out.println("За 3 дня машина призвела "+cBottles+" штук бутылок");
        byte month=30;
        int dBottles=bBottles*month;
        System.out.println("За месяц машина призвела "+dBottles+" штук бутылок");
    }
    public static void task5(){
        System.out.println("Задача 5");
        byte cansPaint=120;
        byte brownPaintKlass=4;
        byte whitePaintKlass=2;
        int totalPaintKlass=brownPaintKlass+whitePaintKlass;
        int totalKlass=cansPaint/totalPaintKlass;
        int totalBrownPaint=totalKlass*brownPaintKlass;
        int totalWhitePaint=totalKlass*whitePaintKlass;
        System.out.println("В школе, где "+totalKlass+" классов,нужно "+totalWhitePaint+" банок белой краски и "+totalBrownPaint+" банок коричневой краски");

    }
    public static void task6(){
        System.out.println("Задача 6");
        byte banana=5;
        short milk=200;
        byte iceCream=2;
        byte eggs=4;
        int weightBanana=banana*80;
        int weightMilk=milk*105/100;
        int weightIceCream=iceCream*100;
        int weightEggs=eggs*70;
        int weightBreakfast=weightBanana+weightMilk+weightIceCream+weightEggs;
        System.out.println("Вес спортзавтрака спортсмена составил "+weightBreakfast+" грамм.");
        float weightBreakfastKg=weightBreakfast/1000f;
        System.out.println("Вес спортзавтрака спортсмена составил "+weightBreakfastKg+" килограмм.");
    }
    public static void task7(){
        System.out.println("Задача 7");
        byte loseWeightKg=7;
        int loseWeightGr=loseWeightKg*1000;
        short grDayOneVar=250;
        short grDayTwoVar=500;
        int dayOneVar=loseWeightGr/grDayOneVar;
        int dayTwoVar=loseWeightGr/grDayTwoVar;
        System.out.println("Спортсмен похудеет за "+dayOneVar+" дней, если будет сбрасывать вес по 250 " +
                "гр. каждый день и за "+dayTwoVar+" дней, если будет худеть по 500гр.в день.");

        int onAverageDays=(dayOneVar+dayTwoVar)/2;
        System.out.println(onAverageDays+" день может потребоваться в среднем, чтобы добиться результата похудения");

    }
    public static void task8(){
        System.out.println("Задача 8");
        int masha=67760;
        int den=83690;
        int kris=76230;
        float newWageMasha=masha*0.1f+masha;
        float newWageDen=den*0.1f+den;
        float newWageKris=kris*0.1f+kris;
        float yearlyNewWageMasha=newWageMasha*12;
        float yearlyNewWageDen=newWageDen*12;
        float yearlyNewWageKris=newWageKris*12;
        int yearlyOldWageMasha=masha*12;
        int yearlyOldWageDen=den*12;
        int yearlyOldWageKris=kris*12;
        float annualDifferenceWageMasha=yearlyNewWageMasha-yearlyOldWageMasha;
        float annualDifferenceWageDen=yearlyNewWageDen-yearlyOldWageDen;
        float annualDifferenceWageKris=yearlyNewWageKris-yearlyOldWageKris;
        System.out.println("Маша теперь получает " +newWageMasha+" рублей в месяц. Годовой доход вырос на "
                +annualDifferenceWageMasha+" рублей");
        System.out.println("Денис теперь получает "+newWageDen+" рублей в месяц. Годовой доход вырос на "
                +annualDifferenceWageDen+" рублей");
        System.out.println("Кристина теперь получает "+newWageKris+" рублей в месяц. Годовой доход вырос на "
                +annualDifferenceWageKris+" рублей!");




















    }





    }