public class Main {
       public static void main( String[] args){
              Boss boss = new Boss();
              boss.setHp(6000000);
              boss.setDmg(1000000);
              boss.setName("Hulk");
              boss.weaponJava.setWeaponName("fist");
              boss.weaponJava.setWeaponType(WeaponType.PNEUMATIC);
              System.out.println("health"+boss.getHp()+"damage"+boss.getName()
                      +"name of Weapon:"+boss.weaponJava.getWeaponName()+
                      "type of weapon:"+boss.weaponJava.getWeaponType());
              
       }
}

