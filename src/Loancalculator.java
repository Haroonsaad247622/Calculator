public class Loancalculator {


    public void loanCalculation(int age, char gender, char profession, int personalassets) {
        teenagers(age,gender,profession,personalassets);
        elders(age,gender,personalassets);
        olders(age,gender,profession,personalassets);

    }
        private void teenagers (int age,char gender,char profession,int personalassets) {

            if (age > 16 && age < 25) {
                if (gender == 'm' || gender == 'f') {
                    if (profession == 'S') {
                        if (personalassets > 25000) {
                            System.out.println("10000");
                        }
                    }
                    if (profession == 'P') {
                        if (personalassets > 25000) {
                            System.out.println("15000");
                        }
                    }
                }
            }

        }
        private void elders (int age,char gender,int personalassets) {
            if (age > 26 && age < 40) {
                if (gender == 'm') {
                    if (personalassets > 40000) {
                        System.out.println("25000");
                    }
                }
                if (gender == 'f') {
                    if (personalassets > 4000) {
                        System.out.println("25000");
                    }
                }
            }
        }
        private void olders(int age,char gender,char profession,int personalassets){
            if(age>41&&age<60){
                if(gender=='m'||gender=='f'||profession=='S'||profession=='P'){
                    if (personalassets>50000){
                        System.out.println("40000");
                    }
                }
            }

        }

};


