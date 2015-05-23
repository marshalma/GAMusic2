import components.MusicEngine;
import fitnessfunction.MelodyFitnessFunction;
import fitnessfunction.MelodyFitnessFunctionBuilder;
import plugins.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) throws Exception {
		JProgressBar progressBar = new JProgressBar();
		MusicEngine generator = null;
		
		MelodyFitnessFunctionBuilder fitnessFunctionBuilder = new MelodyFitnessFunctionBuilder();
		IntervalStrategy strategy1 = new IntervalStrategy();
		GlobalPitchDistributionStrategy strategy2 = new GlobalPitchDistributionStrategy();
		ProportionRestAndNotesStrategy strategy3 = new ProportionRestAndNotesStrategy();
		ScaleStrategy strategy4 = new ScaleStrategy();
		RepeatingNotesStrategy strategy5 = new RepeatingNotesStrategy();
		fitnessFunctionBuilder.addStrategy(strategy1);
		fitnessFunctionBuilder.addStrategy(strategy2);
		fitnessFunctionBuilder.addStrategy(strategy3);
		fitnessFunctionBuilder.addStrategy(strategy4);
		fitnessFunctionBuilder.addStrategy(strategy5);
		
		
		
		try{
			generator = new MusicEngine();
			generator.setProgressBar(progressBar);
			MelodyFitnessFunction melodyFitnessFunction = fitnessFunctionBuilder.build();
			generator.generateMelody(melodyFitnessFunction, 36, 100);
			
		}catch(IllegalStateException e){
			System.out.println(e);
		}
		
		generator.play();
		generator.save("/Users/mashuo/Development/JavaProjects/GAMusic2/");
		
	}

}
