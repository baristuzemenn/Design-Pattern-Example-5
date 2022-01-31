import java.util.*;
public class Main{

    public static void main(String []args){

        double totalPrice = 0;
        Processor selectedProcessor= null;
        MotherBoard selectedMotherBoard= null;
        Ram selectedRam = null;
        GraphicsCard selectedGraphicsCard = null;

        //Scanner for taking input from user
        Scanner scanner = new Scanner(System.in);

        LinkedList<Processor> processors = new LinkedList();
        LinkedList<MotherBoard> motherBoards = new LinkedList();
        LinkedList<Ram> rams = new LinkedList();
        LinkedList<GraphicsCard> graphicCards = new LinkedList();

        Processor intel1 = new Processor("Intel1",1500,0, 12,2500,3500,false);
        Processor intel2 = new Processor("Intel2",2500,0, 16,3500,3500,false);
        Processor intel3 = new Processor("Intel3",3500,0, 20,4500,5500,true);
        Processor intel4 = new Processor("Intel4",4500,0, 24,5500,6500,true);
        Processor intel5 = new Processor("Intel5",5500,0, 28,6500,7500,true);
        processors.add(intel1);processors.add(intel2);processors.add(intel3);processors.add(intel4);processors.add(intel5);

        Processor amd1 = new Processor("Amd1",1500,1, 12,2500,3500,false);
        Processor amd2 = new Processor("Amd2",2000,1, 12,2500,3500,false);
        Processor amd3 = new Processor("Amd3",2500,1, 12,2500,3500,false);
        Processor amd4 = new Processor("Amd4",3000,1, 12,2500,3500,false);
        Processor amd5 = new Processor("Amd5",3500,1, 12,2500,3500,true);
        processors.add(amd1);processors.add(amd2);processors.add(amd3);processors.add(amd4);processors.add(amd5);

        MotherBoard mb1 = new MotherBoard("Msi B450", 1500 ,0,2,2666);
        MotherBoard mb2 = new MotherBoard("Msi B450", 1500 ,0,2,2666);
        MotherBoard mb3 = new MotherBoard("Msi B450", 1500 ,1,2,2666);
        MotherBoard mb4 = new MotherBoard("Msi B450", 1500 ,1,2,2666);
        motherBoards.add(mb1);motherBoards.add(mb2);motherBoards.add(mb3);motherBoards.add(mb4);

        Ram ram1 = new Ram("Kingston",1000,2,2666,100);
        Ram ram2 = new Ram("Kingston",1500,2,3000,100);
        Ram ram3 = new Ram("Kingston",2000,2,3600,100);
        Ram ram4 = new Ram("Kingston",2500,2,4000,100);
        rams.add(ram1);rams.add(ram2);rams.add(ram3);rams.add(ram4);

        GraphicsCard gCard1 = new GraphicsCard("RTX2080",10000,2,512,12,"DDR5",true);
        GraphicsCard gCard2 = new GraphicsCard("RTX1080",9000,2,512,12,"DDR5",false);
        GraphicsCard gCard3 = new GraphicsCard("RTX2060",10000,2,256,12,"DDR5",true);
        GraphicsCard gCard4 = new GraphicsCard("RTX2080",7000,2,512,12,"DDR5",false);
        GraphicsCard gCard5 = new GraphicsCard("RTX2080",10000,2,512,12,"DDR5",true);
        graphicCards.add(gCard1);graphicCards.add(gCard2);graphicCards.add(gCard3);graphicCards.add(gCard4);graphicCards.add(gCard5);

        boolean loop = true;

        //Choosing processor
        while(loop){
            //Print processors
            for(Processor p : processors){
                System.out.println(p);
            }
            System.out.print("Please write the name of processor that you want to add to your system: ");
            String name = scanner.nextLine();
            for(Processor p : processors){
                if (Objects.equals(p.name, name)){
                    selectedProcessor = p;
                    totalPrice += selectedProcessor.price;
                    System.out.println("You select your processor!");
                    System.out.println("Current price is= " + totalPrice);
                    loop = false;
                    break;
                }
            }
        }
        System.out.println("-------------------------------------------------");
        loop = true;

        //Choosing motherboard
        while(loop){
            //Print avaialables
            for(MotherBoard m : motherBoards){
                if(m.compatibility == 2 || m.compatibility == selectedProcessor.compatibility){
                    System.out.println(m);
                }
            }
            System.out.print("Please write the name of mother board that you want to add to your system: ");
            String name = scanner.nextLine();
            for(MotherBoard m : motherBoards){
                if (Objects.equals(m.name, name)){
                    selectedMotherBoard = m;
                    totalPrice += selectedMotherBoard.price;
                    System.out.println("You select your mother board!");
                    System.out.println("Current price is= " + totalPrice);
                    loop = false;
                    break;
                }
            }

        }
        System.out.println("-------------------------------------------------");
        loop = true;

        //Choosing ram
        while(loop){
            //Print avaialables
            for(Ram r : rams){
                if(r.compatibility == 2 || r.compatibility==selectedProcessor.compatibility){
                    System.out.println(r);
                }
            }
            System.out.print("Please write the name of ram that you want to add to your system: ");
            String name = scanner.nextLine();
            for(Ram r : rams){
                if (Objects.equals(r.name, name)){
                    selectedRam = r;
                    totalPrice += selectedRam.price;
                    System.out.println("You select your ram!");
                    System.out.println("Current price is= " + totalPrice);
                    loop = false;
                    break;
                }
            }

        }
        System.out.println("-------------------------------------------------");
        loop = true;

        //Choosing graphic card
        while(loop){
            //Print avaialables
            for(GraphicsCard g : graphicCards){
                if(g.compatibility == 2 || g.compatibility==selectedProcessor.compatibility){
                    System.out.println(g);
                }
            }
            System.out.print("Please write the name of Graphic Card that you want to add to your system: ");
            String name = scanner.nextLine();
            for(GraphicsCard g : graphicCards){
                if (Objects.equals(g.name, name)){
                    selectedGraphicsCard = g;
                    totalPrice += selectedGraphicsCard.price;
                    System.out.println("You select your graphic card!");
                    System.out.println("Current price is= " + totalPrice);
                    loop = false;
                    break;
                }
            }

        }
        System.out.println("--------------------------------------------------");
        System.out.println("You build your computer.");
        System.out.println("Selected Processor: " + selectedProcessor.name+
                "\nSelected Mother Board: " + selectedMotherBoard.name+
                "\nSelected Ram: " + selectedRam.name+
                "\nSelected Graphics Card: " + selectedGraphicsCard.name);
        System.out.println("Total Price is= " + totalPrice);
    }
}