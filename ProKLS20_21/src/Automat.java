public interface Automat {
    public void start();

    public void stay();

    public void change(State state);

    public void documentError();

    public String deny();


}
