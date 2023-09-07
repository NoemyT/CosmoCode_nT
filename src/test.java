public class test {
    public static void main(String[] args) {
        Galaxia viaLactea = new Galaxia("Via Láctea");

        SistemaSolar sistemaSolar = new SistemaSolar("Sistema Solar", viaLactea);

        Estrela sol = new Estrela("Sol", 1.989e30, 4, "Ana Amarela", 5778, sistemaSolar);
        sistemaSolar.adicionarEstrela(sol);

        Planeta terra = new Planeta("Terra", 5.972e24, 1.0, 1, 6371, 4, sol);
        Planeta marte = new Planeta("Marte", 6.4171e23, 1.5, 2, 3389, 4, sol);

        sol.adicionarPlaneta(terra);
        sol.adicionarPlaneta(marte);

        Lua lua = new Lua("Lua", 7.35e22, 4, 1737, terra);

        terra.adicionarLua(lua);

        System.out.println("------------------------------");
        System.out.println("Informações da Galáxia:");
        System.out.println(viaLactea.descricao());

        System.out.println("------------------------------");
        System.out.println("Informações do Sistema Solar:");
        System.out.println(sistemaSolar.descricao());

        System.out.println("------------------------------");
        System.out.println("Informações da Estrela:");
        System.out.println(sol.descricao());

        System.out.println("------------------------------");
        System.out.println("Informações dos Planetas:");
        for (Planeta planeta : sol.getPlanetas()) {
            System.out.println("------------------------------");
            System.out.println(planeta.descricao());
        }

        System.out.println("------------------------------");
        System.out.println("Informações da Lua:");
        System.out.println(lua.descricao());
    }
}




/* A fazer
Outras Classes(Sistema Solar, Galaxia)
Menu
Tratamento de erros(no menu talvez?)
Revisao das formulas(?)
Refatorar o codigo(gambiarra)
Outros metodos ainda nao pensados
Ver um jeito de melhorar as entradas
Resolver bug das fontes(utf8)
Melhorar o metodo de exibição(função descrição)
Passar o nome das classes para o ingles
*/