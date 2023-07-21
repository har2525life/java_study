public class Fighter {
    String name;
    int atk;

    Fighter() {
        name = "戦士";
        atk = 10;
    }

    void attack() {
        System.out.println(name + "の攻撃!");
        System.out.println("敵に" + atk + "のダメージ!");
    }
}