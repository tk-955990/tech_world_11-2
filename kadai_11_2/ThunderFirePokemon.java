package kadai_11_2;

public class ThunderFirePokemon implements ThunderPokemon, FirePokemon {

	public void attack() {
		System.out.println("Pokemon�̍U��");
	}

	public void defense() {
		System.out.println("Pokemon�̖h��");
	}

	public void ThunderAttack() {
		System.out.println("ThunderPokemon�̗��U��");
	}

	public void FireAttack() {
		System.out.println("FirePokemon�̉��U��");
	}
}
