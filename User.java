import java.util.Date;
import java.util.List;

public class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Address address;

    public User(Date birthdate, int size, List<Photo> photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public Date getBirthdate() {return birthdate;}
    public int getSize() {return size;}
    public List<Photo> getPhotos() {return photos;}
    public Address getAddress() {return address;}

    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}
    public void setSize(int size) {this.size = size;}
    public void setPhotos(List<Photo> photos) {this.photos = photos;}
    public void setAddress(Address address) {this.address = address;}
}