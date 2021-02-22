package Paquete;

public class persona {
    private String nombre;
    private int edad;
    private char sexo;
    private String DNI;
    private float altura;
    private float peso;


    public persona() {
        nombre = "";
        edad = 0;
        generaDNI();
        sexo = 'H';
        altura = 0;
        peso = 0;
    }

    public persona (String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        altura = 0;
        peso = 0;
        generaDNI();
    }

    public persona (String nombre, int edad, char sexo,  float altura, float peso ){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        generaDNI();
    }

    public int calcularIMC(){
        double IMC;
        IMC = peso/Math.pow(altura, 2);
        if (IMC < 20 ){
            return -1;
        }else if (IMC >= 20 && IMC<=25 ){
            return 0;
        }else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if (edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    private void comprobarSexo(){
        if (sexo!='H' && sexo!= 'M'){
            sexo = 'H';
        }
    }

    public String toString(){
        return  "nombre:" + nombre + "\n"+
                "Edad:" + edad + "\n" +
                "Sexo:" + sexo + "\n" +
                "DNI:" + DNI + "\n" +
                "Peso:" + peso + "\n" +
                "Altura:" + altura + "\n" ;
    }

    private void generaDNI(){
        int dni = (int)(Math.random()*(99999999-10000000+1)+10000000);
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo= dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        DNI = String.valueOf(dni)+letra;

    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
