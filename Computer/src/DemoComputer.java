
public class DemoComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Да се създадат 2 обекта от тип Computer.
//		Да се зададат стойности на всеки от компютрите за year, price,
//		hardDiskMemory, freeMemory, operationSystem.Нека единият компютър
//		да е лаптоп. На единия от двата компютъра да се задели памет 100
//		(чрез метода useMemory), а на другия, да се смени операционната
//		система (чрез метода changeOperationSystem), след което да се
//		изведат на екрана всичките полета на двата компютъра.
//	
		Computer pc=new Computer();
		
		pc.freeMemory=1050;
		pc.hardDiskMemory=10000;
		pc.year=2000;
		pc.price=1231.6;
		pc.operationSystem="Windows";
		pc.isNotebook=false;
		Computer notebook=new Computer();
		notebook.freeMemory=10500;
		notebook.hardDiskMemory=25694;
		notebook.year=2016;
		notebook.price=856.6;
		notebook.operationSystem="Linux";
		notebook.isNotebook=true;
		pc.useMemory(100);
		notebook.changeOperationSystem("Windows");
		System.out.println("Pc -- "+ pc.freeMemory +", "+pc.hardDiskMemory+", "+pc.year+", "+pc.price+", "+ pc.operationSystem+",is notebook "+pc.isNotebook);
		System.out.println("------------");
		System.out.println("Notebook -- "+ notebook.freeMemory +", "+notebook.hardDiskMemory+", "+notebook.year+", "+notebook.price+", "+ notebook.operationSystem+",is notebook "+notebook.isNotebook);

		
	}

}
