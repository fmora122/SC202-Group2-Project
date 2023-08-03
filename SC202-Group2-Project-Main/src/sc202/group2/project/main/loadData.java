/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.group2.project.main;

/**
 *
 * @author fmora
 */
public class loadData {
    
    public Cattle[] loadCattle(Cattle mycattle[]) {
        int size = 65;
        mycattle = new Cattle[size];
        mycattle[0] = new Cattle(001, "felipe", 03, 1050.6, "Male", "Bavarian");
        mycattle[1] = new Cattle(002, "mari", 26, 720.5, "Female", "Jersey");
        mycattle[2] = new Cattle(003, "Alexis", 15, 1100.3, "Male", "Bavarian");
        mycattle[3] = new Cattle(004, "Fernanda", 18, 700.5, "Female", "Jersey");
        mycattle[4] = new Cattle(005, "Antonia", 07, 727.7, "Female", "Bavarian");
        mycattle[5] = new Cattle(010, "Neira", 30, 690.9, "Female", "Jersey");
        mycattle[6] = new Cattle(011, "Delgado", 14, 900.3, "Male", "Bavarian");
        mycattle[7] = new Cattle(012, "Marcos" , 15, 1002.1, "Male", "Montbeliarde");
        mycattle[8]= new Cattle(014, "Laura", 24, 699.1, "Female", "Jersey");
        mycattle[9] = new Cattle(015, "Victor", 19, 1149.3, "Male", "Bavarian");
        mycattle[10] = new Cattle(016, "Manuel", 28, 1052.4, "Male", "Jersey");
        mycattle[11] = new Cattle(017, "Cristian", 26, 1008.2, "Male", "Bavarian");
        mycattle[12] = new Cattle(020,"felix", 03, 1001.1, "Male", "Montbeliarde");
        mycattle[13] = new Cattle(021, "Micaela", 06, 890.8, "Female", "Jersey");
        mycattle[14] = new Cattle(022,"Jesica", 14, 785.6,"Female", "Montbeliarde");
        mycattle[15] = new Cattle(023, "Maria", 04, 789.1, "Female", "Holstein");
        mycattle[16] = new Cattle(024,"Lazaro" , 24, 1000, "Male", "Montbeliarde");
        mycattle[17] = new Cattle(025, "Nuria", 26, 770.7, "Female", "Bavarian");
        mycattle[18] = new Cattle(030, "feliu", 27, 1178.4, "Male", "Holstein");
        mycattle[19] = new Cattle(031, "Marisol", 12, 615.6, "Female", "Bavarian");
        mycattle[20] = new Cattle(032, "Luis", 16, 998.9, "Male", "Bavarian");
        mycattle[21] = new Cattle(033, "Gabriela", 14, 720.5, "Female", "Jersey");
        mycattle[22] = new Cattle(034, "Francisco", 28, 920.5, "Male", "Bavarian");
        mycattle[23] = new Cattle(035, "Marcel" , 18, 1029.7, "Male", "Holstein");
        mycattle[24] = new Cattle(036, "Rebeca", 01, 890.1, "Female", "Jersey");
        mycattle[25] = new Cattle(037, "Diego", 02, 1089.1, "Male", "Holstein");
        mycattle[26] = new Cattle(040, "Aya", 21, 708.1, "Female", "Holstein");
        mycattle[27] = new Cattle(042, "Hamid", 22, 1222.2, "Male", "Montbeliarde");
        mycattle[28] = new Cattle(043, "Dominga", 19, 720.1, "Female", "Jersey");
        mycattle[29] = new Cattle(044, "Felipa", 29, 701.1, "Female","Holstein");
        mycattle[30] = new Cattle(045, "Andreu", 30, 1134.9, "Male", "Montbeliarde");
        mycattle[31] = new Cattle(046, "Aritz", 18, 1120.6, "Male", "Jersey");
        mycattle[32] = new Cattle(047, "Imanol", 27, 920.4, "Male", "Bavarian");
        mycattle[33] = new Cattle(050, "Esther", 17, 708.9, "Female", "Holstein");
        mycattle[34] = new Cattle(051, "Ignacio", 13, 1202.4, "Male", "Jersey");
        mycattle[35] = new Cattle(052, "Raquel", 16, 879.3, "Female", "Montbeliarde");
        mycattle[36] = new Cattle(053, "Raimundo", 04, 1067.4,"Male", "Holstein");
        mycattle[37] = new Cattle(054, "Amparu", 06, 723.5, "Female", "Jersey");
        mycattle[38] = new Cattle(055, "Judith", 16, 713.1, "Female", "Bavarian");
        mycattle[39] = new Cattle(056, "Alexandru", 29, 999.9, "Male", "Jersey");
        mycattle[40] = new Cattle(057, "Roman", 12, 1032.6, "Male", "Bavarian");
        mycattle[41] = new Cattle(060, "Barbara", 25, 686.7, "Female","Holstein");
        mycattle[42] = new Cattle(656, "Josefa", 19, 32.6, "male", "Montbeliarde");
        mycattle[43] = new Cattle(007, "Eloy", 8, 1090.8, "Male", "Holstein");
        mycattle[44] = new Cattle(888, "Diego", 13, 1067.9, "Male", "Bavarian");
        mycattle[45] = new Cattle(669, "Salome", 23, 1200.7 , "Male", "Montbeliarde");
        mycattle[46] = new Cattle(758, "Marta", 11, 699.6, "Female", "Bavarian");
        mycattle[47] = new Cattle(559, "Fernando", 14, 1029.5, "Male", "Montbeliarde");
        mycattle[48] = new Cattle(548, "Yaiza", 25, 690.4, "Female", "Bavarian");
        mycattle[49] = new Cattle(549, "Paulino", 26, 1002.3, "Male", "Bavarian");
        mycattle[50] = new Cattle(865, "June", 9, 754.2, "Female", "Jersey");
        mycattle[51] = new Cattle(338, "Sarai", 1, 675.3, "Female", "Bavarian");
        mycattle[52] = new Cattle(639, "Manuel", 05, 1111.1,"Male", "Montbeliarde");
        mycattle[53] = new Cattle(326, "Juan", 8, 1024.1, "Male", "Bavarian");
        mycattle[54] = new Cattle(827, "Ana", 9, 763.2, "Female", "Holstein");
        mycattle[55] = new Cattle(328, "Miguel", 11, 1202, "Male", "Montbeliarde");
        mycattle[56] = new Cattle(629, "Daniel" , 13, 1007.8, "Male", "Bavarian");
        mycattle[57] = new Cattle(518, "Paula", 04, 800, "Female", "Montbeliarde");
        mycattle[58] = new Cattle(819, "Saturnino", 01, 1220.4, "Male", "Holstein");
        mycattle[59] = new Cattle(913, "Mark", 9, 1020.5, "Male","Bavarian");
        return mycattle;
    }
    
    public Estate[] loadEstate(Estate myEstate[]) {
        int size = 60;
        myEstate = new Estate[size];
        myEstate[0]=new Estate("la Paz", "Heredia", "Fabricio", 122, 22622192, 2, 1000.5, 20);
        myEstate[1]=new Estate("los Alamos", "San Jose", "Ramon", 193, 60026790, 3, 1567.3, 30);
        myEstate[2]=new Estate("la Gema", "Cartago", "Pedro", 186, 88179015, 1, 742.1, 10);        
        return myEstate;
    }
    /*
    public Paddocks[] loadPaddocks(Cattle myPaddock[]) {
        int size = 4;
        myPaddock = new Cattle[size];
        myPaddock[0]=new Paddocks();
        return myPaddock;
        
    }
    */
    public Cattle[] addNewCattle(Cattle mycattle[], int cattleID, String cattleName, int cattleBirthdate, double cattleLastWeight, String cattleSexString, String cattleBreed) {
            int slot= mycattle.length+1; // generamos una variable nueva basada en la longitud del objeto feligreses, le sumamos 1
                Cattle mycattlePlus[] = new Cattle[slot]; // definimos un objeto de tipo feligreses nuevo este nuevo objeto feligreses es mas grande que el anterior por +1
                for (int i = 0; i< mycattle.length; i++) { // rellenamos el objeto feligreses nuevo con el contenido del viejo, importante observar que el for loop corre esta la longitud del objeto feligreses original, osea deja el ultimo espacio en blanco
                    mycattlePlus[i] = mycattle[i];
                }
                mycattle = mycattlePlus; // aqui tomamos al objeto original y lo REEMPLAZAMOS con el nuevo, asi logramos agregar un espacio nuevo y conservar los datos originales
                
                //aqui agregamos al mae nuevo
                mycattle[slot-1]=new Cattle(cattleID, cattleName, cattleBirthdate, cattleLastWeight, cattleSexString, cattleBreed);
                
                /*
                for (int i = 0; i< feligreses.length; i++) {
                    System.out.println(feligreses[i].getNameFeligreses());
                }
                */
                return mycattle;
    }
}
