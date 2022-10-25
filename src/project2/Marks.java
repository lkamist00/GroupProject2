package project2;

public abstract class Marks {

    /*
    2. We have to calculate the average of marks
obtained in three subjects by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage of marks. Provide
implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and B the marks in four subjects
     */
    int sub1;
    int sub2;
    int sub3;

    Marks(int sub1, int sub2, int sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    abstract void getPercantage();

}

class A extends Marks {

    A(int sub1, int sub2, int sub3) {
        super(sub1, sub2, sub3);
    }

    @Override
    void getPercantage() {
        System.out.println("Average for A is "+(sub1+sub2+sub3)/3);
    }
}

class B extends Marks{

    int sub4;
    B(int sub1, int sub2, int sub3, int sub4) {
        super(sub1, sub2, sub3);
        this.sub4=sub4;
    }

    @Override
    void getPercantage() {
        System.out.println("Average for B is "+(sub1+sub2+sub3+sub4)/4);
    }
}
