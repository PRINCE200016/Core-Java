package com.itrainu.Basic;

import com.itrainu.Basic.Functionalintf.FunctionalIntf;

public class FunctionallntfLembdaTest {

	public static void main(String[] args) {

			FunctionalIntf f = (a, b) -> {
				return (a + b);
			};

			int a = 20;
			int b = 15;

			System.out.println(f.sum(a, b));
			f.sub(a, b);
			FunctionalIntf.multi(a, b);
			f.sum1(a, b);

		}

	}


