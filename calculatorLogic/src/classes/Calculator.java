package classes;

import enums.EnumOperations;
import interfaces.IAdditionalFeatures;
import interfaces.IOperacije;

public class Calculator implements IOperacije, IAdditionalFeatures {
	
	int a = 0;
	protected double _firstNumber;
	protected double _secondNumber;
	protected double _result;
	
	protected boolean _operationExecuted;
	protected EnumOperations _operation;

	
	public Calculator() {
	
		this._firstNumber = 0;
		this._secondNumber = 0;
		this._result = 0;
		this._operationExecuted = false;
		this._operation = EnumOperations.none;
	
	}
	
	public double get_firstNumber() {
		return _firstNumber;
	}
	public void set_firstNumber(double _firstNumber) {
		this._firstNumber = _firstNumber;
	}
	public double get_secondNumber() {
		return _secondNumber;
	}
	public void set_secondNumber(double _secondtNumber) {
		this._secondNumber = _secondtNumber;
	}
	public double get_result() {
		return _result;
	}
	public void set_result(double _result) {
		this._result = _result;
	}
	public boolean is_operationExecuted() {
		return _operationExecuted;
	}
	public void set_operationExecuted(boolean _operationExecuted) {
		this._operationExecuted = _operationExecuted;
	}
	public EnumOperations get_operation() {
		return _operation;
	}
	public void set_operation(EnumOperations _operation) {
		this._operation = _operation;
	}
	
	public double add() {
		
		this._result=this._firstNumber + this._secondNumber;
		this._firstNumber = this._result;
		
		return this._result;
	}
		
	public double subtract(){
		
		this._result=this._firstNumber - this._secondNumber;
		this._firstNumber = this._result;
		
		return this._result;
	}
	
		public double multiply(){
		
		this._result=this._firstNumber * this._secondNumber;
		this._firstNumber = this._result;
		
		return this._result;
	}
		
		public double divide(){
			
			this._result=this._firstNumber / this._secondNumber;
			this._firstNumber = this._result;
			
			return this._result;
	}
		
		public double Squared(){
			
			this._result = this._firstNumber * this._firstNumber;
			this._firstNumber = this._result;
			return this._result;
		}
		
		public double Squareroot(){
			
			this._result = Math.sqrt(this._firstNumber);
			this._firstNumber = this._result;
			return this._result;
		}
		
		public String toHexadecimal(){
			
			this._result = this._firstNumber;
			return Double.toHexString(this._result);
			
		}

	
		public double execute(){
			
			this. _operationExecuted = true;
			
			switch(this._operation)
			{
			case add: {return this.add();}
			case subtract: {return this.subtract();}
			case multiply: {return this.multiply();}
			case divide: {return this.divide();}
			case none: {break;}
			}
			
			return 0;
		}

		

	
		}
	





