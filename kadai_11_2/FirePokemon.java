package kadai_11_2;

interface FirePokemon extends Pokemon {

	public void FireAttack();

	@Override
	public void attack();

	@Override
	public void defense();
}
