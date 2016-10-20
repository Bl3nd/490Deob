final class ec extends oi {
	
	static boolean K = false;
	static int[] L = new int[2048];
	static int M;
	static int N = 0;
	private static boolean O = false;
	static int P;
	private static float Q = 1.0F;
	static int R;
	static int[] S = new int[2048];
	static int[] T = new int[65536];
	private static int[] U = new int[1024];
	static int V;
	static int[] W = new int[2048];
	static int X;
	static int Y;
	static of Z;
	private static boolean ab = false;
	private static int bb;
	private static int[] cb = new int[512];
	static int db;
	static boolean eb = true;
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 16) / (var1 - var0);
		}
		
		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 16) / (var2 - var1);
		}
		
		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 16) / (var0 - var2);
		}
		
		if (var0 <= var1 && var0 <= var2) {
			if (var0 < bb) {
				if (var1 > bb) {
					var1 = bb;
				}
				
				if (var2 > bb) {
					var2 = bb;
				}
				
				if (var1 < var2) {
					var5 = var3 <<= 16;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}
					
					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}
					
					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
						var2 -= var1;
						var1 -= var0;
						var0 = U[var0];
						
						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}
									
									a(oi.D, var0, var6, 0, var5 >> 16, var4 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += oi.E;
								}
							}
							
							a(oi.D, var0, var6, 0, var5 >> 16, var3 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += oi.E;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = U[var0];
						
						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}
									
									a(oi.D, var0, var6, 0, var4 >> 16, var5 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += oi.E;
								}
							}
							
							a(oi.D, var0, var6, 0, var3 >> 16, var5 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += oi.E;
						}
					}
				} else {
					var4 = var3 <<= 16;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}
					
					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}
					
					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
						var1 -= var2;
						var2 -= var0;
						var0 = U[var0];
						
						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}
									
									a(oi.D, var0, var6, 0, var5 >> 16, var3 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += oi.E;
								}
							}
							
							a(oi.D, var0, var6, 0, var4 >> 16, var3 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += oi.E;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = U[var0];
						
						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}
									
									a(oi.D, var0, var6, 0, var3 >> 16, var5 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += oi.E;
								}
							}
							
							a(oi.D, var0, var6, 0, var3 >> 16, var4 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += oi.E;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < bb) {
				if (var2 > bb) {
					var2 = bb;
				}
				
				if (var0 > bb) {
					var0 = bb;
				}
				
				if (var2 < var0) {
					var3 = var4 <<= 16;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}
					
					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}
					
					if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
						var0 -= var2;
						var2 -= var1;
						var1 = U[var1];
						
						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}
									
									a(oi.D, var1, var6, 0, var3 >> 16, var5 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += oi.E;
								}
							}
							
							a(oi.D, var1, var6, 0, var3 >> 16, var4 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += oi.E;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = U[var1];
						
						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}
									
									a(oi.D, var1, var6, 0, var5 >> 16, var3 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += oi.E;
								}
							}
							
							a(oi.D, var1, var6, 0, var4 >> 16, var3 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += oi.E;
						}
					}
				} else {
					var5 = var4 <<= 16;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}
					
					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}
					
					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = U[var1];
						
						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}
									
									a(oi.D, var1, var6, 0, var3 >> 16, var4 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += oi.E;
								}
							}
							
							a(oi.D, var1, var6, 0, var5 >> 16, var4 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += oi.E;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = U[var1];
						
						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}
									
									a(oi.D, var1, var6, 0, var4 >> 16, var3 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += oi.E;
								}
							}
							
							a(oi.D, var1, var6, 0, var4 >> 16, var5 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += oi.E;
						}
					}
				}
			}
		} else if (var2 < bb) {
			if (var0 > bb) {
				var0 = bb;
			}
			
			if (var1 > bb) {
				var1 = bb;
			}
			
			if (var0 < var1) {
				var4 = var5 <<= 16;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}
				
				var3 <<= 16;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}
				
				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = U[var2];
					
					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}
								
								a(oi.D, var2, var6, 0, var4 >> 16, var3 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += oi.E;
							}
						}
						
						a(oi.D, var2, var6, 0, var4 >> 16, var5 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += oi.E;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = U[var2];
					
					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}
								
								a(oi.D, var2, var6, 0, var3 >> 16, var4 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += oi.E;
							}
						}
						
						a(oi.D, var2, var6, 0, var5 >> 16, var4 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += oi.E;
					}
				}
			} else {
				var3 = var5 <<= 16;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}
				
				var4 <<= 16;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}
				
				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = U[var2];
					
					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}
								
								a(oi.D, var2, var6, 0, var4 >> 16, var5 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += oi.E;
							}
						}
						
						a(oi.D, var2, var6, 0, var3 >> 16, var5 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += oi.E;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = U[var2];
					
					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}
								
								a(oi.D, var2, var6, 0, var5 >> 16, var4 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += oi.E;
							}
						}
						
						a(oi.D, var2, var6, 0, var5 >> 16, var3 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += oi.E;
					}
				}
			}
		}
	}
	
	static void a(float v) {
		b(v);
		c(0, 512);
	}
	
	private static void a(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (K) {
			if (var5 > R) {
				var5 = R;
			}
			
			if (var4 < 0) {
				var4 = 0;
			}
		}
		
		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (eb) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (N == 0) {
					if (var3 > 0) {
						do {
							var2 = T[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
					
					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = T[var6 >> 8];
						
						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
						
					}
				} else {
					var8 = N;
					var9 = 256 - N;
					if (var3 > 0) {
						do {
							var2 = T[var6 >> 8];
							var6 += var7;
							var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							--var3;
						} while (var3 > 0);
					}
					
					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = T[var6 >> 8];
						var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
						
						do {
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							--var3;
						} while (var3 > 0);
					}
				}
				
			} else {
				var3 = var5 - var4;
				if (N == 0) {
					do {
						var0[var1++] = T[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
					
				} else {
					var8 = N;
					var9 = 256 - N;
					
					do {
						var2 = T[var6 >> 8];
						var6 += var7;
						var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
						var10 = var0[var1];
						var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
						--var3;
					} while (var3 > 0);
					
				}
			}
		}
	}
	
	private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (K) {
			if (var6 > R) {
				var6 = R;
			}
			
			if (var5 < 0) {
				var5 = 0;
			}
		}
		
		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (O) {
				var23 = var5 - P;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}
				
				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}
				
				var2 = (var18 << 20) + var19;
				var16 = ((var20 - var18) / var17 << 20) + (var21 - var19) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (ab) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}
					
					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);
						
						return;
					}
					
					return;
				}
				
				if (var17 > 0) {
					do {
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						var7 += var8;
						var15 = var7 >> 8;
						--var17;
					} while (var17 > 0);
				}
				
				var17 = var6 - var5 & 7;
				if (var17 > 0) {
					do {
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						--var17;
					} while (var17 > 0);
					
				}
			} else {
				var23 = var5 - P;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}
				
				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}
				
				var2 = (var18 << 18) + var19;
				var16 = ((var20 - var18) / var17 << 18) + (var21 - var19) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (ab) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}
					
					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);
						
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}
					
					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				}
			}
			
		}
	}
	
	static void d() {
		P = R / 2;
		M = bb / 2;
		Y = -P;
		X = R - P;
		db = -M;
		V = bb - M;
	}
	
	private static void b(float v) {
		Q = v;
		Q = (float) ((double) Q + (Math.random() * 0.03D - 0.015D));
	}
	
	static void a(of class_of) {
		Z = class_of;
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Z.a((byte) -89, Q, var18);
		int var20;
		if (var19 == null) {
			var20 = Z.c(var18, -30480);
			a(var0, var1, var2, var3, var4, var5, b(var20, var6), b(var20, var7), b(var20, var8));
		} else {
			O = Z.a(var18, (int) 18872);
			ab = Z.a(false, var18);
			var20 = var4 - var3;
			int var21 = var1 - var0;
			int var22 = var5 - var3;
			int var23 = var2 - var0;
			int var24 = var7 - var6;
			int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0) {
				var26 = (var4 - var3 << 16) / (var1 - var0);
			}
			
			int var27 = 0;
			if (var2 != var1) {
				var27 = (var5 - var4 << 16) / (var2 - var1);
			}
			
			int var28 = 0;
			if (var2 != var0) {
				var28 = (var3 - var5 << 16) / (var0 - var2);
			}
			
			int var29 = var20 * var23 - var22 * var21;
			if (var29 != 0) {
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = var11 * var12 - var14 * var9 << 14;
				int var33 = var14 * var15 - var17 * var12 << 5;
				int var34 = var17 * var9 - var11 * var15 << 5;
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = var13 * var15 - var16 * var12 << 5;
				int var37 = var16 * var9 - var10 * var15 << 5;
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = var16 * var14 - var13 * var17 << 5;
				int var40 = var10 * var17 - var16 * var11 << 5;
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < bb) {
						if (var1 > bb) {
							var1 = bb;
						}
						
						if (var2 > bb) {
							var2 = bb;
						}
						
						var6 = (var6 << 9) - var30 * var3 + var30;
						if (var1 < var2) {
							var5 = var3 <<= 16;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}
							
							var4 <<= 16;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}
							
							var41 = var0 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
								var2 -= var1;
								var1 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 16;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}
							
							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}
							
							var41 = var0 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < bb) {
						if (var2 > bb) {
							var2 = bb;
						}
						
						if (var0 > bb) {
							var0 = bb;
						}
						
						var7 = (var7 << 9) - var30 * var4 + var30;
						if (var2 < var0) {
							var3 = var4 <<= 16;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}
							
							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}
							
							var41 = var1 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
								var0 -= var2;
								var2 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 16;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}
							
							var3 <<= 16;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}
							
							var41 = var1 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											a(oi.D, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									a(oi.D, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < bb) {
					if (var0 > bb) {
						var0 = bb;
					}
					
					if (var1 > bb) {
						var1 = bb;
					}
					
					var8 = (var8 << 9) - var30 * var5 + var30;
					if (var0 < var1) {
						var4 = var5 <<= 16;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}
						
						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}
						
						var41 = var2 - M;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}
										
										a(oi.D, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								a(oi.D, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}
										
										a(oi.D, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								a(oi.D, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 16;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}
						
						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}
						
						var41 = var2 - M;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}
										
										a(oi.D, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								a(oi.D, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}
										
										a(oi.D, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								a(oi.D, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}
	
	static void e() {
		f(oi.J, oi.F, oi.G, oi.I);
	}
	
	private static void f(int var0, int var1, int var2, int var3) {
		R = var2 - var0;
		bb = var3 - var1;
		d();
		if (U.length < bb) {
			U = new int[qh.a(bb, 25920)];
		}
		
		int var4 = var1 * oi.E + var0;
		
		for (int var5 = 0; var5 < bb; ++var5) {
			U[var5] = var4;
			var4 += oi.E;
		}
		
	}
	
	private static void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (K) {
			if (var5 > R) {
				var5 = R;
			}
			
			if (var4 < 0) {
				var4 = 0;
			}
		}
		
		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (N == 0) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						
						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}
							
							var0[var1++] = var2;
						}
					}
					
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			} else if (N == 254) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						
						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}
							
							var0[var1++] = var0[var1];
						}
					}
					
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
				}
			} else {
				int var6 = N;
				int var7 = 256 - N;
				var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & '\uff00') * var7 >> 8 & '\uff00');
				
				while (true) {
					--var3;
					int var8;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						
						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}
							
							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
						}
					}
					
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
				}
			}
		}
	}
	
	private static int b(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}
		
		return (var0 & 'ﾀ') + var1;
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3;
		int var10 = var1 - var0;
		int var11 = var5 - var3;
		int var12 = var2 - var0;
		int var13 = var7 - var6;
		int var14 = var8 - var6;
		int var15;
		if (var2 != var1) {
			var15 = (var5 - var4 << 16) / (var2 - var1);
		} else {
			var15 = 0;
		}
		
		int var16;
		if (var1 != var0) {
			var16 = (var9 << 16) / var10;
		} else {
			var16 = 0;
		}
		
		int var17;
		if (var2 != var0) {
			var17 = (var11 << 16) / var12;
		} else {
			var17 = 0;
		}
		
		int var18 = var9 * var12 - var11 * var10;
		if (var18 != 0) {
			int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
			int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < bb) {
					if (var1 > bb) {
						var1 = bb;
					}
					
					if (var2 > bb) {
						var2 = bb;
					}
					
					var6 = (var6 << 8) - var19 * var3 + var19;
					if (var1 < var2) {
						var5 = var3 <<= 16;
						if (var0 < 0) {
							var5 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}
						
						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var15 * var1;
							var1 = 0;
						}
						
						if (var0 != var1 && var17 < var16 || var0 == var1 && var17 > var15) {
							var2 -= var1;
							var1 -= var0;
							var0 = U[var0];
							
							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}
										
										a(oi.D, var0, 0, 0, var5 >> 16, var4 >> 16, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += oi.E;
									}
								}
								
								a(oi.D, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += oi.E;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = U[var0];
							
							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}
										
										a(oi.D, var0, 0, 0, var4 >> 16, var5 >> 16, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += oi.E;
									}
								}
								
								a(oi.D, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += oi.E;
							}
						}
					} else {
						var4 = var3 <<= 16;
						if (var0 < 0) {
							var4 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}
						
						var5 <<= 16;
						if (var2 < 0) {
							var5 -= var15 * var2;
							var2 = 0;
						}
						
						if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) {
							var1 -= var2;
							var2 -= var0;
							var0 = U[var0];
							
							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}
										
										a(oi.D, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += oi.E;
									}
								}
								
								a(oi.D, var0, 0, 0, var4 >> 16, var3 >> 16, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += oi.E;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = U[var0];
							
							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}
										
										a(oi.D, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += oi.E;
									}
								}
								
								a(oi.D, var0, 0, 0, var3 >> 16, var4 >> 16, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += oi.E;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < bb) {
					if (var2 > bb) {
						var2 = bb;
					}
					
					if (var0 > bb) {
						var0 = bb;
					}
					
					var7 = (var7 << 8) - var19 * var4 + var19;
					if (var2 < var0) {
						var3 = var4 <<= 16;
						if (var1 < 0) {
							var3 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}
						
						var5 <<= 16;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}
						
						if ((var1 == var2 || var16 >= var15) && (var1 != var2 || var16 <= var17)) {
							var0 -= var2;
							var2 -= var1;
							var1 = U[var1];
							
							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}
										
										a(oi.D, var1, 0, 0, var5 >> 16, var3 >> 16, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += oi.E;
									}
								}
								
								a(oi.D, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += oi.E;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = U[var1];
							
							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}
										
										a(oi.D, var1, 0, 0, var3 >> 16, var5 >> 16, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += oi.E;
									}
								}
								
								a(oi.D, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += oi.E;
							}
						}
					} else {
						var5 = var4 <<= 16;
						if (var1 < 0) {
							var5 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}
						
						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var17 * var0;
							var0 = 0;
						}
						
						if (var16 < var15) {
							var2 -= var0;
							var0 -= var1;
							var1 = U[var1];
							
							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}
										
										a(oi.D, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += oi.E;
									}
								}
								
								a(oi.D, var1, 0, 0, var5 >> 16, var4 >> 16, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += oi.E;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = U[var1];
							
							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}
										
										a(oi.D, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += oi.E;
									}
								}
								
								a(oi.D, var1, 0, 0, var4 >> 16, var5 >> 16, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += oi.E;
							}
						}
					}
				}
			} else if (var2 < bb) {
				if (var0 > bb) {
					var0 = bb;
				}
				
				if (var1 > bb) {
					var1 = bb;
				}
				
				var8 = (var8 << 8) - var19 * var5 + var19;
				if (var0 < var1) {
					var4 = var5 <<= 16;
					if (var2 < 0) {
						var4 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}
					
					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var16 * var0;
						var0 = 0;
					}
					
					if (var15 < var17) {
						var1 -= var0;
						var0 -= var2;
						var2 = U[var2];
						
						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}
									
									a(oi.D, var2, 0, 0, var4 >> 16, var3 >> 16, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += oi.E;
								}
							}
							
							a(oi.D, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += oi.E;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = U[var2];
						
						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}
									
									a(oi.D, var2, 0, 0, var3 >> 16, var4 >> 16, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += oi.E;
								}
							}
							
							a(oi.D, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += oi.E;
						}
					}
				} else {
					var3 = var5 <<= 16;
					if (var2 < 0) {
						var3 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}
					
					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var16 * var1;
						var1 = 0;
					}
					
					if (var15 < var17) {
						var0 -= var1;
						var1 -= var2;
						var2 = U[var2];
						
						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}
									
									a(oi.D, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += oi.E;
								}
							}
							
							a(oi.D, var2, 0, 0, var3 >> 16, var5 >> 16, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += oi.E;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = U[var2];
						
						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}
									
									a(oi.D, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += oi.E;
								}
							}
							
							a(oi.D, var2, 0, 0, var5 >> 16, var3 >> 16, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += oi.E;
						}
					}
				}
			}
		}
	}
	
	public static void f() {
		U = null;
		T = null;
		Z = null;
		cb = null;
		S = null;
		W = null;
		L = null;
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Z.a((byte) -40, Q, var18);
		int var20;
		if (var19 == null) {
			var20 = Z.c(var18, -30480);
			a(var0, var1, var2, var3, var4, var5, b(var20, var6), b(var20, var7), b(var20, var8));
		} else {
			O = Z.a(var18, (int) 18872);
			ab = Z.a(false, var18);
			var20 = var4 - var3;
			int var21 = var1 - var0;
			int var22 = var5 - var3;
			int var23 = var2 - var0;
			int var24 = var7 - var6;
			int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0) {
				var26 = (var4 - var3 << 16) / (var1 - var0);
			}
			
			int var27 = 0;
			if (var2 != var1) {
				var27 = (var5 - var4 << 16) / (var2 - var1);
			}
			
			int var28 = 0;
			if (var2 != var0) {
				var28 = (var3 - var5 << 16) / (var0 - var2);
			}
			
			int var29 = var20 * var23 - var22 * var21;
			if (var29 != 0) {
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = var11 * var12 - var14 * var9 << 14;
				int var33 = var14 * var15 - var17 * var12 << 8;
				int var34 = var17 * var9 - var11 * var15 << 5;
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = var13 * var15 - var16 * var12 << 8;
				int var37 = var16 * var9 - var10 * var15 << 5;
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = var16 * var14 - var13 * var17 << 8;
				int var40 = var10 * var17 - var16 * var11 << 5;
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < bb) {
						if (var1 > bb) {
							var1 = bb;
						}
						
						if (var2 > bb) {
							var2 = bb;
						}
						
						var6 = (var6 << 9) - var30 * var3 + var30;
						if (var1 < var2) {
							var5 = var3 <<= 16;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}
							
							var4 <<= 16;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}
							
							var41 = var0 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
								var2 -= var1;
								var1 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 16;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}
							
							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}
							
							var41 = var0 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = U[var0];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < bb) {
						if (var2 > bb) {
							var2 = bb;
						}
						
						if (var0 > bb) {
							var0 = bb;
						}
						
						var7 = (var7 << 9) - var30 * var4 + var30;
						if (var2 < var0) {
							var3 = var4 <<= 16;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}
							
							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}
							
							var41 = var1 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
								var0 -= var2;
								var2 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 16;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}
							
							var3 <<= 16;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}
							
							var41 = var1 - M;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = U[var1];
								
								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}
											
											b(oi.D, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += oi.E;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}
									
									b(oi.D, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += oi.E;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < bb) {
					if (var0 > bb) {
						var0 = bb;
					}
					
					if (var1 > bb) {
						var1 = bb;
					}
					
					var8 = (var8 << 9) - var30 * var5 + var30;
					if (var0 < var1) {
						var4 = var5 <<= 16;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}
						
						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}
						
						var41 = var2 - M;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}
										
										b(oi.D, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								b(oi.D, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}
										
										b(oi.D, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								b(oi.D, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 16;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}
						
						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}
						
						var41 = var2 - M;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}
										
										b(oi.D, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								b(oi.D, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = U[var2];
							
							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}
										
										b(oi.D, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += oi.E;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}
								
								b(oi.D, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += oi.E;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}
	
	private static void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (K) {
			if (var6 > R) {
				var6 = R;
			}
			
			if (var5 < 0) {
				var5 = 0;
			}
		}
		
		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (O) {
				var23 = var5 - P;
				var9 += (var12 >> 3) * var23;
				var10 += (var13 >> 3) * var23;
				var11 += (var14 >> 3) * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}
				
				var9 += var12;
				var10 += var13;
				var11 += var14;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}
				
				var2 = (var18 << 20) + var19;
				var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (ab) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 12;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}
							
							var2 = (var18 << 20) + var19;
							var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}
					
					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);
						
						return;
					}
					
					return;
				}
				
				if (var17 > 0) {
					do {
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var10000 = var2 + var16;
						var18 = var20;
						var19 = var21;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var22 = var11 >> 12;
						if (var22 != 0) {
							var20 = var9 / var22;
							var21 = var10 / var22;
						} else {
							var20 = 0;
							var21 = 0;
						}
						
						var2 = (var18 << 20) + var19;
						var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
						var7 += var8;
						var15 = var7 >> 8;
						--var17;
					} while (var17 > 0);
				}
				
				var17 = var6 - var5 & 7;
				if (var17 > 0) {
					do {
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}
						
						++var4;
						var2 += var16;
						--var17;
					} while (var17 > 0);
					
				}
			} else {
				var23 = var5 - P;
				var9 += (var12 >> 3) * var23;
				var10 += (var13 >> 3) * var23;
				var11 += (var14 >> 3) * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}
				
				var9 += var12;
				var10 += var13;
				var11 += var14;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}
				
				var2 = (var18 << 18) + var19;
				var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (ab) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 14;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}
							
							var2 = (var18 << 18) + var19;
							var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}
					
					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);
						
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 14;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}
							
							var2 = (var18 << 18) + var19;
							var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}
					
					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}
							
							++var4;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				}
			}
			
		}
	}
	
	private static void c(int unused, int unused2) {
		int i = 0;
		for (int i1 = 0; i1 < 512; ++i1) {
			double d = (double) (i1 >> 3) / 64.0D + 0.0078125D;
			double d2 = (double) (i1 & 7) / 8.0D + 0.0625D;
			for (int i2 = 0; i2 < 128; ++i2) {
				double d3 = (double) i2 / 128.0D;
				double d4 = d3;
				double d5 = d3;
				double d6 = d3;
				if (d2 != 0.0D) {
					double d7;
					if (d3 < 0.5D) {
						d7 = d3 * (1.0D + d2);
					} else {
						d7 = d3 + d2 - d3 * d2;
					}
					
					double d8 = 2.0D * d3 - d7;
					double d9 = d + 0.3333333333333333D;
					if (d9 > 1.0D) {
						--d9;
					}
					
					double d10 = d - 0.3333333333333333D;
					if (d10 < 0.0D) {
						++d10;
					}
					
					if (6.0D * d9 < 1.0D) {
						d4 = d8 + (d7 - d8) * 6.0D * d9;
					} else if (2.0D * d9 < 1.0D) {
						d4 = d7;
					} else if (3.0D * d9 < 2.0D) {
						d4 = d8 + (d7 - d8) * (0.6666666666666666D - d9) * 6.0D;
					} else {
						d4 = d8;
					}
					
					if (6.0D * d < 1.0D) {
						d5 = d8 + (d7 - d8) * 6.0D * d;
					} else if (2.0D * d < 1.0D) {
						d5 = d7;
					} else if (3.0D * d < 2.0D) {
						d5 = d8 + (d7 - d8) * (0.6666666666666666D - d) * 6.0D;
					} else {
						d5 = d8;
					}
					
					if (6.0D * d10 < 1.0D) {
						d6 = d8 + (d7 - d8) * 6.0D * d10;
					} else if (2.0D * d10 < 1.0D) {
						d6 = d7;
					} else if (3.0D * d10 < 2.0D) {
						d6 = d8 + (d7 - d8) * (0.6666666666666666D - d10) * 6.0D;
					} else {
						d6 = d8;
					}
				}
				
				d4 = Math.pow(d4, (double) Q);
				d5 = Math.pow(d5, (double) Q);
				d6 = Math.pow(d6, (double) Q);
				int i3 = (int) (d4 * 256.0D);
				int i4 = (int) (d5 * 256.0D);
				int i5 = (int) (d6 * 256.0D);
				int i6 = (i3 << 16) + (i4 << 8) + i5;
				if (i6 == 0) {
					i6 = 1;
				}
				
				T[i++] = i6;
			}
		}
		
	}
	
	static void b(int var0, int var1, int var2) {
		K = var0 < 0 || var0 > R || var1 < 0 || var1 > R || var2 < 0 || var2 > R;
	}
	
	static void d(int var0, int var1) {
		int var2 = U[0];
		int var3 = var2 / oi.E;
		int var4 = var2 - var3 * oi.E;
		P = var0 - var4;
		M = var1 - var3;
		Y = -P;
		X = R - P;
		db = -M;
		V = bb - M;
	}
	
	static {
		for (int var0 = 1; var0 < 512; ++var0) {
			cb[var0] = '耀' / var0;
		}
		
		for (int var1 = 1; var1 < 2048; ++var1) {
			S[var1] = 65536 / var1;
		}
		
		for (int var2 = 0; var2 < 2048; ++var2) {
			W[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
			L[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
		}
		
	}
}
