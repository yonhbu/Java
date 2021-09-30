package co.com.mall.factory;

import co.com.mall.operaciones.OperacionesNumPosivosImp;
import co.com.mall.port.IOperaciones;

public class FactoryOperation {
	
	public static IOperaciones getOperation() {
		return new OperacionesNumPosivosImp();
	}

}
