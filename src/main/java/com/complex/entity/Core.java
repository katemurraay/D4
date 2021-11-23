package com.complex.entity;


import java.sql.Timestamp;
import java.util.Date;

public class Core {
    public Job job;

    private double speed;
    private Socket socket;
    private int coreId;

    private double dynamicPower;
    private double parkPower;
    private double idlePower;

    public Core() {
        this.job = null;
        this.speed = 2.0;
        dynamicPower = 40.0 * (4.0 / 5.0) / 2;
        parkPower = 0;
        idlePower = dynamicPower / 5.0;
    }

    public void print(){
        if(this.job!=null) {
            this.job.print();
        } else{
            System.out.println("No job in this core!");
        }
    }

    public void assignJob(final double time, Job onejob){
        if (this.job != null) {
            System.out.println("Already has a job!");
        }else if(onejob != null){
            this.job=onejob;
            double startTime=time;
            Timestamp t = new Timestamp(new Date().getTime());
            job.markStart(startTime);
            job.setStartDate(t.toString());
        } else{
            System.out.println("Error!No job in this core!");
        }
    }

    public void process(double time) throws InterruptedException {
        if (this.job != null){
            int currentProgress=0;
            if(this.speed==0){
                job=null;
                System.out.println("speed is 0! cannot handle any job!");
                return;
            }
            while(currentProgress<job.getJobSize()){
                currentProgress+=this.speed;
                Thread.sleep(1000);
            }
            if(currentProgress>=job.getJobSize()){
                this.job.markFinish(time+currentProgress/this.speed);
                Timestamp t = new Timestamp(new Date().getTime());
                job.setFinishDate(t.toString());
                this.job.print();
                System.out.println("Job "+this.job.getJobId()+" is finished.");
                this.job=null;
            }
        } else{
            System.out.println("Error!No job in this core!");
        }
    }

    public void removeJob(final double time, final Job oneJob){
        if (this.job != null) {
            System.out.println("Error!No job in this core!");
        }else if(oneJob !=null){
            double finishTime=time+oneJob.getJobSize()/this.speed;
            oneJob.markFinish(finishTime);
            this.job = oneJob;
            this.job=null;
        } else{
            System.out.println("Error!No job in this core!");
        }
    }

    public Job getJob(){
        return this.job;
    }

//    public AJAXReturn STARTWORK(Core core,int num){
//        Job job=new Job(num);
//        long time= new Date().getTime();
//        AJAXReturn ajaxReturn = new AJAXReturn();
//        core.assignJob(time,job);
//        core.process(time);
//        ajaxReturn.setErrcode(0);
//        ajaxReturn.setErrmsg("execution successful");
//        ajaxReturn.setData(JsonUtils.objectToJson(job));
//        if(job.getFinishDate().equals(null)||job.getFinishDate().equals("")){
//            ajaxReturn.setErrmsg("something cash!");
//            ajaxReturn.setErrcode(2);
//        }
//        return ajaxReturn;
//    }

    public static void main(String[] args) throws InterruptedException {
        Core core= new Core();
//        core.STARTWORK(core,5);
        Job job=new Job(5);
//        TimeParse timeParse = new TimeParse();
        Timestamp t;
        t = new Timestamp(new Date().getTime());
        long time= new Date().getTime();
        core.assignJob(time,job);
        core.process(time);
    }

}
