
//Class Pengguna
public class Pengguna{

//Atribut Pengguna
    private int id;
    private String username;
    private String password;

//Method Constructor
public Pengguna(){
    System.out.println("Object telah diciptakan, constructor berjalan");  
}

// Method Pengguna
public void login(){
    System.out.println("ini method untuk login");
}

public void lupaPassword(){
   System.out.println("ini method lupa password"); 
}

public void daftar(){
    System.out.println("ini method daftar user baru");
}

// Method Getter Pengguna
    public int getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

//M     ethod Setter
public void setId(int id){
    this.id =id;
}

public void setUsername(String username){
    this.username =username;
}

public void setPassword(String password){
    this.password =password;
}


}