package com.example.design.structural.adapter.pegAdapter;

import com.example.design.structural.adapter.pegAdapter.adapters.SquarePegAdapter;
import com.example.design.structural.adapter.pegAdapter.round.RoundHole;
import com.example.design.structural.adapter.pegAdapter.round.RoundPeg;
import com.example.design.structural.adapter.pegAdapter.square.SquarePeg;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdaptorApplication {

	public static void main(String[] args) {
		// Round fits round, no surprise.
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		if (hole.fits(rpeg)) {
			System.out.println("Round peg r5 fits round hole r5.");
		}

		SquarePeg smallSqPeg = new SquarePeg(2);
		SquarePeg largeSqPeg = new SquarePeg(20);
		// hole.fits(smallSqPeg); // Won't compile.

		// Adapter solves the problem.
		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
		SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
		if (hole.fits(smallSqPegAdapter)) {
			System.out.println("Square peg w2 fits round hole r5.");
		}
		if (!hole.fits(largeSqPegAdapter)) {
			System.out.println("Square peg w20 does not fit into round hole r5.");
		}
	}

}
