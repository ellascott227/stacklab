import java.lang.RuntimeException;

public class StackUnderFlowException extends RuntimeException
{

	private static final long serialVersionUID = 1379324098649974111L;

	public StackUnderFlowException()
	{
		super("Stack is Empty; you cannot perform this opperation.");
	}

	public StackUnderFlowException(String message)
	{
		super(message);
	}

}