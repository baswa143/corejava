package Enum;

public enum Week {
    MONDAY(9,6), TUESDAY(10,7),  WEDNESDAY, THURSDAY,FRIDAY,SATURDAY, SUNDAY;
    final int index;
    final String status;
    final double openingtime;
    final double closingtime;

    private Week()
    {
        this.index = 0;
        this.status = "";
        this.openingtime = 0;
        this.closingtime = 0;
    }
    private Week(int index){
        this.index=index;
        this.status = "";
        this.openingtime = 0;
        this.closingtime = 0;
    }
    private Week(String status){
        this.index=0;
        this.status=status;
       this.openingtime = 0;
       this.closingtime = 0;
    }
    private Week(int index,String status){
        this.openingtime = 0;
        this.closingtime = 0;
        this.index=index;
        this.status=status;
    }
    private Week(double openingtime,double closingtime){
        this.index=0;
        this.status="";
        this.openingtime=openingtime;
        this.closingtime=closingtime;
    }



}

