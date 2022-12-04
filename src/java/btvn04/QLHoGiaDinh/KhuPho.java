package QLHoGiaDinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KhuPho {
    private List<Family> khuPho;
    private String name;

    public KhuPho(){this.khuPho = new ArrayList<>();}

    public KhuPho(String name){
        this.name = name;
        this.khuPho = new ArrayList<>();
    }

    public List<Family> getDanhSachKhuPho(){return this.khuPho;}

    public void addFamily(Family family){
        this.khuPho.add(family);
    }

    public void removeFamily(int homeNumber){
        Family family = this.khuPho.stream().filter(f-> Objects.equals(homeNumber, f.getHomeNumber())).findFirst().orElse(null);
        if(Objects.nonNull(family)) this.khuPho.remove(family);
    }

    @Override
    public String toString() {
        return "KhuPho{" + "khuPho=" + this.khuPho + ", name='" + name + '\'' + '}';
    }
}
