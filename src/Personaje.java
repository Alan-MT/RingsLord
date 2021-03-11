public class Personaje {

    protected int vida;
    protected int armadura;
    protected int ataque;
    protected String nombre;
    

    public Personaje(int vida, int armadura, int ataque, String nombre){
        this.vida = vida;
        this.armadura = armadura;
        this.ataque = ataque;
        this.nombre = nombre;

    }
    public int getVida(){
        return vida;
    }
    public int getArmadura(){
        return armadura;
    }
    public int getAtaque(){
        return ataque;
    }
    public String getNombre(){
        return nombre;
    }  
}
