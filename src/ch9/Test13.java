package ch9;

public class Test13 {

}
interface AA{
	
}
interface BB extends AA{
	
}
interface CC extends AA{
	
}
//Cycle detected: the type DD cannot extend/implement
//itself or one of its own member types
//interface DD extends BB, DD{}