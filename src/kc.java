import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class kc extends oi {
	
	int imageHeight;
	int height;
	int[] pixels;
	int N;
	int imageWidth;
	int P;
	int width;
	
	final void f(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.imageWidth;
			int var6 = this.imageHeight;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.width;
			int var10 = this.height;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			int var13;
			if (this.N > 0) {
				var13 = ((this.N << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.N << 16);
			}
			
			if (this.P > 0) {
				var13 = ((this.P << 16) + var12 - 1) / var12;
				var2 += var13;
				var8 += var13 * var12 - (this.P << 16);
			}
			
			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}
			
			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}
			
			var13 = var1 + var2 * oi.E;
			int var14 = oi.E - var3;
			if (var2 + var4 > oi.I) {
				var4 -= var2 + var4 - oi.I;
			}
			
			int var15;
			if (var2 < oi.F) {
				var15 = oi.F - var2;
				var4 -= var15;
				var13 += var15 * oi.E;
				var8 += var12 * var15;
			}
			
			if (var1 + var3 > oi.G) {
				var15 = var1 + var3 - oi.G;
				var3 -= var15;
				var14 += var15;
			}
			
			if (var1 < oi.J) {
				var15 = oi.J - var1;
				var3 -= var15;
				var13 += var15;
				var7 += var11 * var15;
				var14 += var15;
			}
			
			a(oi.D, this.pixels, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}
	
	final void f(int var1) {
		int[] var2 = new int[this.imageWidth * this.imageHeight];
		int var3 = 0;
		
		for (int var4 = 0; var4 < this.imageHeight; ++var4) {
			for (int var5 = 0; var5 < this.imageWidth; ++var5) {
				int var6 = this.pixels[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.pixels[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.pixels[var3 - this.imageWidth] != 0) {
						var6 = var1;
					} else if (var5 < this.imageWidth - 1 && this.pixels[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.imageHeight - 1 && this.pixels[var3 + this.imageWidth] != 0) {
						var6 = var1;
					}
				}
				
				var2[var3++] = var6;
			}
		}
		
		this.pixels = var2;
	}
	
	final void d() {
		int[] var1 = new int[this.imageWidth * this.imageHeight];
		int var2 = 0;
		
		for (int var3 = this.imageHeight - 1; var3 >= 0; --var3) {
			for (int var4 = 0; var4 < this.imageWidth; ++var4) {
				var1[var2++] = this.pixels[var4 + var3 * this.imageWidth];
			}
		}
		
		this.pixels = var1;
		this.P = this.height - this.imageHeight - this.P;
	}
	
	final void b(int var1, int var2, int var3) {
		var1 += this.N;
		var2 += this.P;
		int var4 = var1 + var2 * oi.E;
		int var5 = 0;
		int var6 = this.imageHeight;
		int var7 = this.imageWidth;
		int var8 = oi.E - var7;
		int var9 = 0;
		int var10;
		if (var2 < oi.F) {
			var10 = oi.F - var2;
			var6 -= var10;
			var2 = oi.F;
			var5 += var10 * var7;
			var4 += var10 * oi.E;
		}
		
		if (var2 + var6 > oi.I) {
			var6 -= var2 + var6 - oi.I;
		}
		
		if (var1 < oi.J) {
			var10 = oi.J - var1;
			var7 -= var10;
			var1 = oi.J;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}
		
		if (var1 + var7 > oi.G) {
			var10 = var1 + var7 - oi.G;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}
		
		if (var7 > 0 && var6 > 0) {
			a(oi.D, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}
	
	final void e() {
		int[] var1 = new int[this.imageWidth * this.imageHeight];
		int var2 = 0;
		
		for (int var3 = 0; var3 < this.imageHeight; ++var3) {
			for (int var4 = this.imageWidth - 1; var4 >= 0; --var4) {
				var1[var2++] = this.pixels[var4 + var3 * this.imageWidth];
			}
		}
		
		this.pixels = var1;
		this.N = this.width - this.imageWidth - this.N;
	}
	
	final void a(int var1, int var2, int[] var3, int[] var4) {
		if (oi.I - oi.F != var3.length) {
			throw new IllegalStateException();
		} else {
			var1 += this.N;
			var2 += this.P;
			int var5 = 0;
			int var6 = this.imageHeight;
			int var7 = this.imageWidth;
			int var8 = oi.E - var7;
			int var9 = 0;
			int var10 = var1 + var2 * oi.E;
			int var11;
			if (var2 < oi.F) {
				var11 = oi.F - var2;
				var6 -= var11;
				var2 = oi.F;
				var5 += var11 * var7;
				var10 += var11 * oi.E;
			}
			
			if (var2 + var6 > oi.I) {
				var6 -= var2 + var6 - oi.I;
			}
			
			if (var1 < oi.J) {
				var11 = oi.J - var1;
				var7 -= var11;
				var1 = oi.J;
				var5 += var11;
				var10 += var11;
				var9 += var11;
				var8 += var11;
			}
			
			if (var1 + var7 > oi.G) {
				var11 = var1 + var7 - oi.G;
				var7 -= var11;
				var9 += var11;
				var8 += var11;
			}
			
			if (var7 > 0 && var6 > 0) {
				var11 = var1 - oi.J;
				int var12 = var2 - oi.F;
				
				for (int var13 = var12; var13 < var12 + var6; ++var13) {
					int var14 = var3[var13];
					int var15 = var4[var13];
					int var16 = var7;
					int var17;
					if (var11 > var14) {
						var17 = var11 - var14;
						if (var17 >= var15) {
							var5 += var7 + var9;
							var10 += var7 + var8;
							continue;
						}
						
						var15 -= var17;
					} else {
						var17 = var14 - var11;
						if (var17 >= var7) {
							var5 += var7 + var9;
							var10 += var7 + var8;
							continue;
						}
						
						var5 += var17;
						var16 = var7 - var17;
						var10 += var17;
					}
					
					var17 = 0;
					if (var16 < var15) {
						var15 = var16;
					} else {
						var17 = var16 - var15;
					}
					
					for (int var18 = -var15; var18 < 0; ++var18) {
						int var19 = this.pixels[var5++];
						if (var19 != 0) {
							oi.D[var10++] = var19;
						} else {
							++var10;
						}
					}
					
					var5 += var17 + var9;
					var10 += var17 + var8;
				}
				
			}
		}
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * oi.E;
			
			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;
				
				for (var1 = -var3; var1 < 0; ++var1) {
					int var20 = this.pixels[(var18 >> 16) + (var19 >> 16) * this.imageWidth];
					if (var20 != 0) {
						oi.D[var17++] = var20;
					} else {
						++var17;
					}
					
					var18 += var13;
					var19 -= var12;
				}
				
				var14 += var12;
				var15 += var13;
				var16 += oi.E;
			}
			
		} catch (Exception var21) {
			;
		}
	}
	
	private void e(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.N << 4;
			var2 -= this.P << 4;
			double var7 = (double) (var5 & '\uffff') * 9.587379924285257E-5D;
			int var9 = (int) Math.floor(Math.sin(var7) * (double) var6 + 0.5D);
			int var10 = (int) Math.floor(Math.cos(var7) * (double) var6 + 0.5D);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = var1 * var9 + -var2 * var10;
			int var13 = ((this.imageWidth << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.imageWidth << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.imageHeight << 4) - var2) * var9;
			int var16 = var1 * var9 + ((this.imageHeight << 4) - var2) * var10;
			int var17 = ((this.imageWidth << 4) - var1) * var10 + ((this.imageHeight << 4) - var2) * var9;
			int var18 = -((this.imageWidth << 4) - var1) * var9 + ((this.imageHeight << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}
			
			if (var15 < var19) {
				var19 = var15;
			}
			
			if (var17 < var19) {
				var19 = var17;
			}
			
			if (var15 > var20) {
				var20 = var15;
			}
			
			if (var17 > var20) {
				var20 = var17;
			}
			
			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}
			
			if (var16 < var21) {
				var21 = var16;
			}
			
			if (var18 < var21) {
				var21 = var18;
			}
			
			if (var16 > var22) {
				var22 = var16;
			}
			
			if (var18 > var22) {
				var22 = var18;
			}
			
			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < oi.J) {
				var19 = oi.J;
			}
			
			if (var20 > oi.G) {
				var20 = oi.G;
			}
			
			if (var21 < oi.F) {
				var21 = oi.F;
			}
			
			if (var22 > oi.I) {
				var22 = oi.I;
			}
			
			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * oi.E + var19;
					double var24 = 1.6777216E7D / (double) var6;
					int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5D);
					int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5D);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += oi.E) {
								var34 = var23;
								var35 = var30;
								var36 = var31;
								var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.imageWidth << 12) < 0 && var31 - (this.imageHeight << 12) < 0) {
									for (; var37 < 0; ++var37) {
										var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											oi.D[var34++] = var38;
										} else {
											++var34;
										}
									}
								}
								
								++var33;
							}
							
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += oi.E) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.imageWidth << 12) < 0) {
									if ((var32 = var36 - (this.imageHeight << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}
									
									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}
									
									while (var37 < 0) {
										var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											oi.D[var34++] = var38;
										} else {
											++var34;
										}
										
										var36 += var26;
										++var37;
									}
								}
								
								++var33;
								var30 -= var26;
							}
							
						} else {
							for (var33 = var22; var33 < 0; var23 += oi.E) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.imageWidth << 12) < 0) {
									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}
									
									if ((var32 = (1 + var36 - (this.imageHeight << 12) - var26) / var26) > var37) {
										var37 = var32;
									}
									
									while (var37 < 0) {
										var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											oi.D[var34++] = var38;
										} else {
											++var34;
										}
										
										var36 += var26;
										++var37;
									}
								}
								
								++var33;
								var30 -= var26;
							}
							
						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += oi.E) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31;
								var37 = var20;
								if (var31 >= 0 && var31 - (this.imageHeight << 12) < 0) {
									if ((var32 = var35 - (this.imageWidth << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var34 = var23 + var32;
									}
									
									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}
									
									while (var37 < 0) {
										var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											oi.D[var34++] = var38;
										} else {
											++var34;
										}
										
										var35 += var27;
										++var37;
									}
								}
								
								++var33;
								var31 += var27;
							}
							
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += oi.E) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.imageWidth << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}
								
								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}
								
								if ((var32 = var36 - (this.imageHeight << 12)) >= 0) {
									var32 = (var26 - var32) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}
								
								if ((var32 = (var36 - var26) / var26) > var37) {
									var37 = var32;
								}
								
								while (var37 < 0) {
									var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
									if (var38 != 0) {
										oi.D[var34++] = var38;
									} else {
										++var34;
									}
									
									var35 += var27;
									var36 += var26;
									++var37;
								}
								
								++var33;
								var30 -= var26;
								var31 += var27;
							}
							
						} else {
							for (var33 = var22; var33 < 0; var23 += oi.E) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.imageWidth << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}
								
								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}
								
								if (var36 < 0) {
									var32 = (var26 - 1 - var36) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}
								
								if ((var32 = (1 + var36 - (this.imageHeight << 12) - var26) / var26) > var37) {
									var37 = var32;
								}
								
								while (var37 < 0) {
									var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
									if (var38 != 0) {
										oi.D[var34++] = var38;
									} else {
										++var34;
									}
									
									var35 += var27;
									var36 += var26;
									++var37;
								}
								
								++var33;
								var30 -= var26;
								var31 += var27;
							}
							
						}
					} else if (var26 == 0) {
						for (var33 = var22; var33 < 0; var23 += oi.E) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31;
							var37 = var20;
							if (var31 >= 0 && var31 - (this.imageHeight << 12) < 0) {
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var34 = var23 + var32;
								}
								
								if ((var32 = (1 + var35 - (this.imageWidth << 12) - var27) / var27) > var37) {
									var37 = var32;
								}
								
								while (var37 < 0) {
									var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
									if (var38 != 0) {
										oi.D[var34++] = var38;
									} else {
										++var34;
									}
									
									var35 += var27;
									++var37;
								}
							}
							
							++var33;
							var31 += var27;
						}
						
					} else if (var26 < 0) {
						for (var33 = var22; var33 < 0; var23 += oi.E) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}
							
							if ((var32 = (1 + var35 - (this.imageWidth << 12) - var27) / var27) > var37) {
								var37 = var32;
							}
							
							if ((var32 = var36 - (this.imageHeight << 12)) >= 0) {
								var32 = (var26 - var32) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}
							
							if ((var32 = (var36 - var26) / var26) > var37) {
								var37 = var32;
							}
							
							while (var37 < 0) {
								var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
								if (var38 != 0) {
									oi.D[var34++] = var38;
								} else {
									++var34;
								}
								
								var35 += var27;
								var36 += var26;
								++var37;
							}
							
							++var33;
							var30 -= var26;
							var31 += var27;
						}
						
					} else {
						for (var33 = var22; var33 < 0; var23 += oi.E) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}
							
							if ((var32 = (1 + var35 - (this.imageWidth << 12) - var27) / var27) > var37) {
								var37 = var32;
							}
							
							if (var36 < 0) {
								var32 = (var26 - 1 - var36) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}
							
							if ((var32 = (1 + var36 - (this.imageHeight << 12) - var26) / var26) > var37) {
								var37 = var32;
							}
							
							while (var37 < 0) {
								var38 = this.pixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
								if (var38 != 0) {
									oi.D[var34++] = var38;
								} else {
									++var34;
								}
								
								var35 += var27;
								var36 += var26;
								++var37;
							}
							
							++var33;
							var30 -= var26;
							var31 += var27;
						}
						
					}
				}
			}
		}
	}
	
	private static void a(int[] ints, int[] pixels, int i, int i1, int imageWidth, int imageHeight, int i2, int i3) {
		for (int height = -imageHeight; height < 0; ++height) {
			int width;
			for (width = i1 + imageWidth - 3; i1 < width; ints[i1++] = pixels[i++]) {
				ints[i1++] = pixels[i++];
				ints[i1++] = pixels[i++];
				ints[i1++] = pixels[i++];
			}
			
			for (width += 3; i1 < width; ints[i1++] = pixels[i++]) {
				;
			}
			
			i1 += i2;
			i += i3;
		}
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * oi.E;
			
			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;
				
				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					oi.D[var19++] = this.pixels[(var20 >> 16) + (var21 >> 16) * this.imageWidth];
					var20 += var14;
					var21 -= var13;
				}
				
				var15 += var13;
				var16 += var14;
				var17 += oi.E;
			}
			
		} catch (Exception var22) {
			;
		}
	}
	
	final void f(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.imageWidth;
			int var7 = this.imageHeight;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.width;
			int var11 = this.height;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.N > 0) {
				var14 = ((this.N << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.N << 16);
			}
			
			if (this.P > 0) {
				var14 = ((this.P << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.P << 16);
			}
			
			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}
			
			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}
			
			var14 = var1 + var2 * oi.E;
			int var15 = oi.E - var3;
			if (var2 + var4 > oi.I) {
				var4 -= var2 + var4 - oi.I;
			}
			
			int var16;
			if (var2 < oi.F) {
				var16 = oi.F - var2;
				var4 -= var16;
				var14 += var16 * oi.E;
				var9 += var13 * var16;
			}
			
			if (var1 + var3 > oi.G) {
				var16 = var1 + var3 - oi.G;
				var3 -= var16;
				var15 += var16;
			}
			
			if (var1 < oi.J) {
				var16 = oi.J - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}
			
			a(oi.D, this.pixels, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
		}
	}
	
	private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & '\uff00') * var11 & 16711680;
		var10 = (var12 | var13) >>> 8;
		
		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & '\uff00') * var9 & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					++var4;
				}
			}
			
			var4 += var7;
			var3 += var8;
		}
		
	}
	
	final void g(int var1) {
		for (int var2 = this.imageHeight - 1; var2 > 0; --var2) {
			int var3 = var2 * this.imageWidth;
			
			for (int var4 = this.imageWidth - 1; var4 > 0; --var4) {
				if (this.pixels[var4 + var3] == 0 && this.pixels[var4 + var3 - 1 - this.imageWidth] != 0) {
					this.pixels[var4 + var3] = var1;
				}
			}
		}
		
	}
	
	final void c(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.pixels.length; ++var4) {
			int var5 = this.pixels[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 255;
				var6 += var1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}
				
				int var7 = var5 >> 8 & 255;
				var7 += var2;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}
				
				int var8 = var5 & 255;
				var8 += var3;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}
				
				this.pixels[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}
	
	final void f() {
		oi.a(this.pixels, this.imageWidth, this.imageHeight);
	}
	
	private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);
		
		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
				
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
				
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
				
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}
			
			for (int var12 = var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}
			
			var4 += var7;
			var3 += var8;
		}
		
	}
	
	final kc g() {
		kc class_kc = new kc(this.imageWidth, this.imageHeight);
		class_kc.width = this.width;
		class_kc.height = this.height;
		class_kc.N = this.width - this.imageWidth - this.N;
		class_kc.P = this.P;
		
		for (int var2 = 0; var2 < this.imageHeight; ++var2) {
			for (int var3 = 0; var3 < this.imageWidth; ++var3) {
				class_kc.pixels[var2 * this.imageWidth + var3] = this.pixels[var2 * this.imageWidth + this.imageWidth - 1 - var3];
			}
		}
		
		return class_kc;
	}
	
	private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;
		
		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}
			
			var4 += var7;
			var3 += var8;
		}
		
	}
	
	final void h() {
		if (this.imageWidth != this.width || this.imageHeight != this.height) {
			int[] var1 = new int[this.width * this.height];
			
			for (int var2 = 0; var2 < this.imageHeight; ++var2) {
				for (int var3 = 0; var3 < this.imageWidth; ++var3) {
					var1[(var2 + this.P) * this.width + var3 + this.N] = this.pixels[var2 * this.imageWidth + var3];
				}
			}
			
			this.pixels = var1;
			this.imageWidth = this.width;
			this.imageHeight = this.height;
			this.N = 0;
			this.P = 0;
		}
	}
	
	final void g(int var1, int var2, int var3, int var4) {
		int var5 = this.width << 3;
		int var6 = this.height << 3;
		var1 = (var1 << 4) + (var5 & 15);
		var2 = (var2 << 4) + (var6 & 15);
		this.e(var5, var6, var1, var2, var3, var4);
	}
	
	final void b(int i, int i1) {
		i += this.N;
		i1 += this.P;
		int i2 = i + i1 * oi.E;
		int i3 = 0;
		int imageHeight = this.imageHeight;
		int imageWidth = this.imageWidth;
		int i4 = oi.E - imageWidth;
		int i5 = 0;
		int i6;
		if (i1 < oi.F) {
			i6 = oi.F - i1;
			imageHeight -= i6;
			i1 = oi.F;
			i3 += i6 * imageWidth;
			i2 += i6 * oi.E;
		}
		
		if (i1 + imageHeight > oi.I) {
			imageHeight -= i1 + imageHeight - oi.I;
		}
		
		if (i < oi.J) {
			i6 = oi.J - i;
			imageWidth -= i6;
			i = oi.J;
			i3 += i6;
			i2 += i6;
			i5 += i6;
			i4 += i6;
		}
		
		if (i + imageWidth > oi.G) {
			i6 = i + imageWidth - oi.G;
			imageWidth -= i6;
			i5 += i6;
			i4 += i6;
		}
		
		if (imageWidth > 0 && imageHeight > 0) {
			a(oi.D, this.pixels, i3, i2, imageWidth, imageHeight, i4, i5);
		}
	}
	
	final void h(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.c(var1, var2);
		} else {
			var1 += this.N;
			var2 += this.P;
			int var5 = var1 + var2 * oi.E;
			int var6 = 0;
			int var7 = this.imageHeight;
			int var8 = this.imageWidth;
			int var9 = oi.E - var8;
			int var10 = 0;
			int var11;
			if (var2 < oi.F) {
				var11 = oi.F - var2;
				var7 -= var11;
				var2 = oi.F;
				var6 += var11 * var8;
				var5 += var11 * oi.E;
			}
			
			if (var2 + var7 > oi.I) {
				var7 -= var2 + var7 - oi.I;
			}
			
			if (var1 < oi.J) {
				var11 = oi.J - var1;
				var8 -= var11;
				var1 = oi.J;
				var6 += var11;
				var5 += var11;
				var10 += var11;
				var9 += var11;
			}
			
			if (var1 + var8 > oi.G) {
				var11 = var1 + var8 - oi.G;
				var8 -= var11;
				var10 += var11;
				var9 += var11;
			}
			
			if (var8 > 0 && var7 > 0) {
				a(oi.D, this.pixels, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}
	
	final void c(int var1, int var2) {
		var1 += this.N;
		var2 += this.P;
		int var3 = var1 + var2 * oi.E;
		int var4 = 0;
		int var5 = this.imageHeight;
		int var6 = this.imageWidth;
		int var7 = oi.E - var6;
		int var8 = 0;
		int var9;
		if (var2 < oi.F) {
			var9 = oi.F - var2;
			var5 -= var9;
			var2 = oi.F;
			var4 += var9 * var6;
			var3 += var9 * oi.E;
		}
		
		if (var2 + var5 > oi.I) {
			var5 -= var2 + var5 - oi.I;
		}
		
		if (var1 < oi.J) {
			var9 = oi.J - var1;
			var6 -= var9;
			var1 = oi.J;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}
		
		if (var1 + var6 > oi.G) {
			var9 = var1 + var6 - oi.G;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}
		
		if (var6 > 0 && var5 > 0) {
			a(oi.D, this.pixels, 0, var4, var3, var6, var5, var7, var8);
		}
	}
	
	final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * oi.E;
			
			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;
				
				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					int var22 = this.pixels[(var20 >> 16) + (var21 >> 16) * this.imageWidth];
					if (var22 != 0) {
						oi.D[var19++] = var22;
					} else {
						++var19;
					}
					
					var20 += var14;
					var21 -= var13;
				}
				
				var15 += var13;
				var16 += var14;
				var17 += oi.E;
			}
			
		} catch (Exception var23) {
			;
		}
	}
	
	private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;
		
		for (int var15 = -var8; var15 < 0; ++var15) {
			int var16 = (var4 >> 16) * var11;
			
			for (int var17 = -var7; var17 < 0; ++var17) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
				} else {
					++var5;
				}
				
				var3 += var9;
			}
			
			var4 += var10;
			var3 = var14;
			var5 += var6;
		}
		
	}
	
	private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;
		
		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;
			
			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}
				
				var3 += var9;
			}
			
			var4 += var10;
			var3 = var12;
			var5 += var6;
		}
		
	}
	
	final void h(int var1) {
		if (this.imageWidth != this.width || this.imageHeight != this.height) {
			int var2 = var1;
			if (var1 > this.N) {
				var2 = this.N;
			}
			
			int var3 = var1;
			if (var1 + this.N + this.imageWidth > this.width) {
				var3 = this.width - this.N - this.imageWidth;
			}
			
			int var4 = var1;
			if (var1 > this.P) {
				var4 = this.P;
			}
			
			int var5 = var1;
			if (var1 + this.P + this.imageHeight > this.height) {
				var5 = this.height - this.P - this.imageHeight;
			}
			
			int var6 = this.imageWidth + var2 + var3;
			int var7 = this.imageHeight + var4 + var5;
			int[] var8 = new int[var6 * var7];
			
			for (int var9 = 0; var9 < this.imageHeight; ++var9) {
				for (int var10 = 0; var10 < this.imageWidth; ++var10) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.pixels[var9 * this.imageWidth + var10];
				}
			}
			
			this.pixels = var8;
			this.imageWidth = var6;
			this.imageHeight = var7;
			this.N -= var2;
			this.P -= var4;
		}
	}
	
	protected kc() {
	}
	
	kc(int width, int height) {
		this.pixels = new int[width * height];
		this.imageWidth = this.width = width;
		this.imageHeight = this.height = height;
		this.N = this.P = 0;
	}
	
	kc(byte[] imagedata, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(imagedata);
			MediaTracker mediaTracker = new MediaTracker(component);
			mediaTracker.addImage(image, 0);
			mediaTracker.waitForAll();
			this.imageWidth = image.getWidth(component);
			this.imageHeight = image.getHeight(component);
			this.width = this.imageWidth;
			this.height = this.imageHeight;
			this.N = 0;
			this.P = 0;
			this.pixels = new int[this.imageWidth * this.imageHeight];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, this.imageWidth, this.imageHeight,
					this.pixels, 0, this.imageWidth);
			pixelGrabber.grabPixels();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
