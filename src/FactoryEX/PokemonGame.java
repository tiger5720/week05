package FactoryEX;
/*
//before
class Pokemon{
    public void attack(){
        System.out.println("공격!");
    }
}
class Trainer{
    private final Pokemon pokemon;

    public Trainer() {
        pokemon = new Pokemon();   //강한 결합 상태 Trainer -> 포켓몬에 의존상태 둘의 관계를 뗴어놓기 위해 인터페이스가 필요
    }

    public void battle(){
        pokemon.attack();
    }

    public void catchPokemon(){
        System.out.println("포켓몬 획득~");
    }
}
public class PokemonGame {
    public static void main(String[] args) {
        Trainer jiwoo = new Trainer();

        jiwoo.catchPokemon();
        jiwoo.battle();
    }
}
*/

//Factory로 개선
interface Battleable{
    void attack();  //factory method
}

class Pokemon implements Battleable{
    public void attack(){
        System.out.println("공격!");
    }
}
class Trainer{
    private final Battleable battleable;

    public Trainer(Battleable battleable) {
        this.battleable = battleable;
    }

    public void battle(){
        battleable.attack();
    }

    public void catchPokemon(){
        System.out.println("포켓몬 획득~");
    }
}
public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Trainer jiwoo = new Trainer(pikachu);

        jiwoo.catchPokemon();
        jiwoo.battle();
    }
}
