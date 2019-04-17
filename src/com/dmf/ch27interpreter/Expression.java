package com.dmf.ch27interpreter;

public abstract class Expression {
	
	public void Interpret(PlayContext context) {
		if (context.getText().length() == 0) {
			return;
		} else {
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			double playValue =Double.parseDouble(context.getText().substring(0, 
					context.getText().indexOf(" ")));
			context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
			
			Execute(playKey,playValue);
		}
	}
	
	public abstract void Execute(String key,double value);

}
