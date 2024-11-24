package State;

public class Player {
    private boolean lock;
    private State state;
    Player(){
        this.lock = true;
        this.state = new LockState(this);
    }
    public void changeLockStatus(){
        this.lock = !this.lock;
    }

    public void setState(State state){
        this.state = state;
    }

    public void clickLock(){
        this.state.clickLock();
    }

    public void clickPlay(){
        this.state.clickPlay();
    }

    public void clickNext(){
        this.state.clickNext();
    }

    public void clickPrevious(){
        this.state.clickPrevious();
    }
}
