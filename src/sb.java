import java.math.BigInteger;
import java.util.Random;

final class sb extends af {
	
	static int R;
	static pe cacheFile18;
	static int T;
	static BigInteger U = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	static int V;
	static int W;
	private int X = 5;
	private int Y = 2;
	static ra Z;
	static li[] ab = new li[50];
	private static ob createAFreeAccount = rf.a(40, "Create a free account");
	private short[] cb = new short[512];
	static int db;
	static int eb;
	private int fb = 1;
	static int gb;
	static ob createAFreeAccount2;
	static int ib;
	static ob jb;
	static int kb;
	static int lb;
	private int mb = 2048;
	private int anInt_nb = 0;
	private byte[] ob = new byte[512];
	private int pb = 5;
	static int[] qb;
	
	static void b(byte var0) {
		int var14 = client.anInt_wb;
		
		try {
			short var1;
			int var2;
			label217:
			{
				var1 = 256;
				if (pa.e > 0) {
					var2 = 0;
					if (var14 != 0) {
					}
					if (/*var14 != 0 || */~var2 > -257) {
						do {
							if (~pa.e >= -769) {
								if (~pa.e >= -257) {
									ng.x[var2] = eh.a(256 - pa.e, tf.b[var2], (byte) -109, ie.F[var2]);
									if (var14 == 0) {/*
										++var2;
										continue;
									*/
									}
								}
								
								ng.x[var2] = tf.b[var2];
								if (var14 == 0) {/*
									++var2;
									continue;
								*/
								}
							}
							
							ng.x[var2] = eh.a(-pa.e + 1024, ie.F[var2], (byte) -44, tf.b[var2]);
							++var2;
						} while (~var2 > -257);
					}
					
					if (var14 == 0) {/*
						break label217;
					*/
					}
				} else if (si.db <= 0) {
					var2 = 0;
					if (var14 != 0) {
					}
					if (/*var14 != 0 || */~var2 > -257) {
						do {
							ng.x[var2] = ie.F[var2];
							++var2;
						} while (~var2 > -257);
					}
					
					if (var14 == 0) {/*
						break label217;
					*/
					}
				} else {
					var2 = 0;
					if (var14 != 0) {
					}
					if (/*var14 != 0 || */~var2 > -257) {
						do {
							if (si.db > 768) {
								ng.x[var2] = eh.a(-si.db + 1024, ie.F[var2], (byte) -32, nb.nc[var2]);
								if (var14 == 0) {/*
									++var2;
									continue;
								*/
								}
							} else if (~si.db < -257) {
								ng.x[var2] = nb.nc[var2];
								if (var14 == 0) {/*
									++var2;
									continue;
								*/
								}
							} else {
								ng.x[var2] = eh.a(-si.db + 256, nb.nc[var2], (byte) -50, ie.F[var2]);
							}
							++var2;
						} while (~var2 > -257);
					}
				}
			}
			
			++db;
			int var4 = 0;
			int var3 = 9 * kh.H.imageWidth;
			var2 = 0;
			if (var0 != -110) {
				createAFreeAccount = null;
			}
			
			int var5 = 1;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			if (var14 != 0) {
			}
			if (/*var14 != 0 ||*/ ~(-1 + var1) < ~var5) {
				do {
					var6 = sh.r[var5] * (var1 - var5) / var1 + 22;
					if (~var6 > -1) {
						var6 = 0;
					}
					
					var2 += var6;
					var7 = var6;
					if (var14 != 0) {
					}
					if (/*var14 != 0 || */~var6 > -129) {
						do {
							var9 = kh.H.pixels[var3++];
							var8 = r.R[var2++];
							if (~var8 == -1) {
								lh.ub.pixels[var4++] = var9;
								if (var14 == 0) {/*
									++var7;
									continue;
								*/
								}
							} else {
								var10 = var8;
								var11 = -var8 + 256;
								var8 = ng.x[var8];
								lh.ub.pixels[var4++] = bd.b(16711680, var10 * bd.b('\uff00', var8) + var11 * bd.b(var9, (int) '\uff00')) + bd.b(var10 * bd.b(16711935, var8) - -(bd.b(var9, 16711935) * var11), -16711936) >> 8;
							}
							++var7;
						} while (~var7 > -129);
					}
					
					var8 = 0;
					if (var14 != 0) {}
					if (/*var14 != 0 || */var6 > var8) {
						do {
							lh.ub.pixels[var4++] = kh.H.pixels[var3++];
							++var8;
						} while (var6 > var8);
					}
					
					var3 += kh.H.imageWidth - 128;
					++var5;
				} while (~(-1 + var1) < ~var5);
			}
			
			var4 = 0;
			var2 = 0;
			lh.ub.b(0, 9);
			var3 = 9 * kh.H.imageWidth + 128;
			var6 = 1;
			if (var14 == 0 && -1 + var1 <= var6) {
				b.Y.b(637, 9);
			} else {
				do {
					var7 = (var1 - var6) * sh.r[var6] / var1 + 22;
					if (var7 < 0) {
						var7 = 0;
					}
					
					var8 = 0;
					if (var14 != 0) {}
					if (/*var14 != 0 || */var8 < var7) {
						do {
							int var10001 = var4++;
							--var3;
							b.Y.pixels[var10001] = kh.H.pixels[var3];
							++var8;
						} while (var8 < var7);
					}
					
					var9 = var7;
					if (var14 != 0) {}
					if (/*var14 != 0 || */var7 < 128) {
						do {
							--var3;
							var11 = kh.H.pixels[var3];
							var10 = r.R[var2++];
							if (var10 != 0) {
								int var13 = 256 - var10;
								int var12 = var10;
								var10 = ng.x[var10];
								b.Y.pixels[var4++] = bd.b(var13 * bd.b(var11, (int) '\uff00') + var12 * bd.b('\uff00', var10), 16711680) + bd.b(-16711936, bd.b(var11, 16711935) * var13 + var12 * bd.b(var10, 16711935)) >> 8;
								if (var14 != 0) {
									b.Y.pixels[var4++] = var11;
									++var9;
								} else {
									++var9;
								}
							} else {
								b.Y.pixels[var4++] = var11;
								++var9;
							}
						} while (var9 < 128);
					}
					
					var3 += kh.H.imageWidth - -128;
					var2 += var7;
					++var6;
				} while (-1 + var1 > var6);
				
				b.Y.b(637, 9);
			}
		} catch (RuntimeException var15) {
			throw bc.a(var15, "sb.K(" + var0 + ')');
		}
	}
	
	public static void i(int var0) {
		try {
			U = null;
			createAFreeAccount2 = null;
			Z = null;
			cacheFile18 = null;
			jb = null;
			createAFreeAccount = null;
			ab = null;
			qb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sb.P(" + var0 + ')');
		}
	}
	
	private void c(byte var1) {
		int var5 = client.anInt_wb;
		
		try {
			Random var3 = new Random((long) this.anInt_nb);
			this.cb = new short[512];
			++lb;
			if (this.mb > 0) {
				int var4 = 0;
				if (var5 != 0 || ~var4 > -513) {
					do {
						this.cb[var4] = (short) v.a((byte) 109, var3, this.mb);
						++var4;
					} while (~var4 > -513);
					
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "sb.O(" + var1 + ')');
		}
	}
	
	final void f(int var1) {
		try {
			this.ob = bc.b((byte) -43, this.anInt_nb);
			this.c((byte) 26);
			++R;
			if (var1 != 1) {
				j(56);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "sb.L(" + var1 + ')');
		}
	}
	
	static int b(byte var0, int var1) {
		try {
			++kb;
			if (var0 != 33) {
				Z = null;
			}
			
			return var1 >>> 8;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "sb.J(" + var0 + ',' + var1 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var19 = client.anInt_wb;
		
		try {
			if (var1 < 13) {
				return null;
			} else {
				int[] var3 = super.nd_v.a(var2, 12);
				++W;
				if (super.nd_v.n) {
					int var4 = 2048 + rh.r[var2] * this.pb;
					int var5 = var4 >> 12;
					int var6 = 1 + var5;
					int var14 = 0;
					if (var19 != 0 || lh.eb > var14) {
						do {
							od.eb = Integer.MAX_VALUE;
							pe.d = Integer.MAX_VALUE;
							re.A = Integer.MAX_VALUE;
							qg.g = Integer.MAX_VALUE;
							int var15 = this.X * bd.J[var14] + 2048;
							int var16 = var15 >> 12;
							int var17 = var16 + 1;
							int var8 = var5 - 1;
							int var18;
							if (var19 != 0 || ~var6 <= ~var8) {
								do {
									label252:
									{
										int var12 = 255 & this.ob[255 & (~this.pb < ~var8 ? var8 : var8 - this.pb)];
										int var7 = -1 + var16;
										byte[] var10000;
										int var10001;
										int var10002;
										if (var19 != 0) {
											var10000 = this.ob;
											var10001 = var12;
											var10002 = ~var7 <= ~this.X ? -this.X + var7 : var7;
										} else {
											if (~var17 > ~var7) {
												break label252;
											}
											
											var10000 = this.ob;
											var10001 = var12;
											var10002 = ~var7 <= ~this.X ? -this.X + var7 : var7;
										}
										
										while (true) {
											int var11;
											label244:
											{
												int var9;
												int var10;
												label243:
												{
													double var22;
													label294:
													{
														int var21;
														label295:
														{
															int var13 = (var10000[var10001 + var10002 & 255] & 255) * 2;
															var9 = var15 - (this.cb[var13++] + (var7 << 12));
															var10 = -(var8 << 12) - (this.cb[var13] - var4);
															var18 = this.fb;
															if (~var18 != -2) {
																if (var18 == 3) {
																	var10 = var10 >= 0 ? var10 : -var10;
																	var9 = ~var9 > -1 ? -var9 : var9;
																	var21 = var9 > var10 ? var9 : var10;
																	break label295;
																}
																
																if (~var18 == -5) {
																	var9 = (int) (Math.sqrt((double) ((float) (~var9 > -1 ? -var9 : var9) / 4096.0F)) * 4096.0D);
																	var22 = 4096.0D;
																	var10001 = var10 >= 0 ? var10 : -var10;
																	break label294;
																}
																
																if (var18 == 5) {
																	break label243;
																}
																
																if (var18 != 2) {
																	var11 = (int) (Math.sqrt((double) ((float) (var9 * var9 - -(var10 * var10)) / 1.6777216E7F)) * 4096.0D);
																	break label244;
																}
																
																if (var19 == 0) {
																	var11 = (~var10 > -1 ? -var10 : var10) + (var9 >= 0 ? var9 : -var9);
																	if (var19 != 0) {
																		var11 = (int) (Math.sqrt((double) ((float) (var9 * var9 - -(var10 * var10)) / 1.6777216E7F)) * 4096.0D);
																	}
																	break label244;
																}
															}
															
															var11 = var10 * var10 + var9 * var9 >> 12;
															if (var19 == 0) {
																break label244;
															}
															
															var10 = var10 >= 0 ? var10 : -var10;
															var9 = ~var9 > -1 ? -var9 : var9;
															var21 = var9 > var10 ? var9 : var10;
														}
														
														var11 = var21;
														if (var19 == 0) {
															break label244;
														}
														
														var9 = (int) (Math.sqrt((double) ((float) (~var9 > -1 ? -var9 : var9) / 4096.0F)) * 4096.0D);
														var22 = 4096.0D;
														var10001 = var10 >= 0 ? var10 : -var10;
													}
													
													var10 = (int) (var22 * Math.sqrt((double) ((float) var10001 / 4096.0F)));
													var11 = var10 + var9;
													var11 = var11 * var11 >> 12;
													if (var19 == 0) {
														break label244;
													}
												}
												
												var9 *= var9;
												var10 *= var10;
												var11 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var10 + var9) / 1.6777216E7F))) * 4096.0D);
												if (var19 != 0) {
													var11 = (~var10 > -1 ? -var10 : var10) + (var9 >= 0 ? var9 : -var9);
													if (var19 != 0) {
														var11 = (int) (Math.sqrt((double) ((float) (var9 * var9 - -(var10 * var10)) / 1.6777216E7F)) * 4096.0D);
													}
												}
											}
											
											label248:
											{
												if (~qg.g < ~var11) {
													od.eb = pe.d;
													pe.d = re.A;
													re.A = qg.g;
													qg.g = var11;
													if (var19 == 0) {
														++var7;
														break label248;
													}
												}
												
												if (~var11 > ~re.A) {
													od.eb = pe.d;
													pe.d = re.A;
													re.A = var11;
													if (var19 != 0) {
														if (var11 >= pe.d) {
															if (var11 < od.eb) {
																od.eb = var11;
																if (var19 != 0) {
																	od.eb = pe.d;
																	pe.d = var11;
																}
															}
														} else {
															od.eb = pe.d;
															pe.d = var11;
														}
														
														++var7;
													} else {
														++var7;
													}
												} else {
													if (var11 >= pe.d) {
														if (var11 < od.eb) {
															od.eb = var11;
															if (var19 != 0) {
																od.eb = pe.d;
																pe.d = var11;
															}
														}
													} else {
														od.eb = pe.d;
														pe.d = var11;
													}
													
													++var7;
												}
											}
											
											if (~var17 > ~var7) {
												break;
											}
											
											var10000 = this.ob;
											var10001 = var12;
											var10002 = ~var7 <= ~this.X ? -this.X + var7 : var7;
										}
									}
									
									++var8;
								} while (~var6 <= ~var8);
							}
							
							label280:
							{
								label279:
								{
									label278:
									{
										label277:
										{
											label276:
											{
												var18 = this.Y;
												if (var18 != 0) {
													if (var18 == 1) {
														break label276;
													}
													
													if (var18 == 3) {
														break label277;
													}
													
													if (var18 == 4) {
														break label278;
													}
													
													if (var18 != 2) {
														break label280;
													}
													
													if (var19 == 0) {
														break label279;
													}
												}
												
												var3[var14] = qg.g;
												if (var19 == 0) {
													break label280;
												}
											}
											
											var3[var14] = re.A;
											if (var19 == 0) {
												break label280;
											}
										}
										
										var3[var14] = pe.d;
										if (var19 == 0) {
											break label280;
										}
									}
									
									var3[var14] = od.eb;
									if (var19 == 0) {
										break label280;
									}
								}
								
								var3[var14] = -qg.g + re.A;
							}
							
							++var14;
						} while (lh.eb > var14);
					}
				}
				
				return var3;
			}
		} catch (RuntimeException var20) {
			throw bc.a(var20, "sb.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var6 = client.anInt_wb;
		
		try {
			label65:
			{
				label64:
				{
					label63:
					{
						label62:
						{
							label61:
							{
								label60:
								{
									label59:
									{
										if (var1 != 0) {
											if (var1 == 1) {
												break label59;
											}
											
											if (~var1 == -3) {
												break label60;
											}
											
											if (var1 == 3) {
												break label61;
											}
											
											if (var1 == 4) {
												break label62;
											}
											
											if (var1 == 5) {
												break label63;
											}
											
											if (~var1 != -7) {
												break label65;
											}
											
											if (var6 == 0) {
												break label64;
											}
										}
										
										this.X = this.pb = var3.readUnsignedByte(255);
										if (var6 == 0) {
											break label65;
										}
									}
									
									this.anInt_nb = var3.readUnsignedByte(255);
									if (var6 == 0) {
										break label65;
									}
								}
								
								this.mb = var3.readShort(83);
								if (var6 == 0) {
									break label65;
								}
							}
							
							this.Y = var3.readUnsignedByte(255);
							if (var6 == 0) {
								break label65;
							}
						}
						
						this.fb = var3.readUnsignedByte(255);
						if (var6 == 0) {
							break label65;
						}
					}
					
					this.X = var3.readUnsignedByte(255);
					if (var6 == 0) {
						break label65;
					}
				}
				
				this.pb = var3.readUnsignedByte(255);
			}
			
			++ib;
		} catch (RuntimeException var7) {
			throw bc.a(var7, "sb.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var15 = client.anInt_wb;
		
		try {
			++eb;
			int var6 = var0 + -var1;
			int var7 = var5 + -var4;
			if (~var7 == -1) {
				if (var6 != 0) {
					gf.a(var4, var3, var0, var1, var2 + 638213620);
				}
				
			} else if (var6 == 0) {
				fh.a(var1, var5, true, var4, var3);
			} else {
				if (~var7 > -1) {
					var7 = -var7;
				}
				
				if (~var6 > -1) {
					var6 = -var6;
				}
				
				boolean var8 = var6 > var7;
				int var9;
				int var10;
				if (var8) {
					var9 = var4;
					var4 = var1;
					var10 = var5;
					var1 = var9;
					var5 = var0;
					var0 = var10;
				}
				
				if (var5 < var4) {
					var9 = var4;
					var4 = var5;
					var5 = var9;
					var10 = var1;
					var1 = var0;
					var0 = var10;
				}
				
				if (var2 != -638213620) {
					qb = null;
				}
				
				var9 = var1;
				int var11 = -var1 + var0;
				if (~var11 > -1) {
					var11 = -var11;
				}
				
				int var13 = ~var1 > ~var0 ? 1 : -1;
				var10 = var5 + -var4;
				int var12 = -(var10 >> 1);
				int var14;
				if (var8) {
					var14 = var4;
					if (var15 != 0 || ~var5 <= ~var4) {
						do {
							e.ints_b[var14][var9] = var3;
							var12 += var11;
							if (~var12 < -1) {
								var9 += var13;
								var12 -= var10;
							}
							
							++var14;
						} while (~var5 <= ~var14);
						
					}
				} else {
					var14 = var4;
					if (var15 != 0 || var4 <= var5) {
						do {
							e.ints_b[var9][var14] = var3;
							var12 += var11;
							if (var12 > 0) {
								var12 -= var10;
								var9 += var13;
							}
							
							++var14;
						} while (var14 <= var5);
						
					}
				}
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "sb.M(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}
	
	public sb() {
		super(0, true);
	}
	
	static void j(int var0) {
		try {
			ci.s.b((int) 9946);
			++T;
			rd.N.b((int) 9946);
			mi.W.b((int) 9946);
			int var1 = -114 % ((var0 - -33) / 34);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "sb.Q(" + var0 + ')');
		}
	}
	
	static int a(og var0, ob var1, int var2) {
		try {
			++V;
			int var3 = var0.pointer;
			var0.l(8, var1.length);
			var0.pointer += mg.h.a(-786703935, 0, var1.length, var1.buffer, var0.buffer, var0.pointer);
			return -var3 + var0.pointer;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "sb.N(" + "{...}" + ',' + "{...}" + ',' + var2 + ')');
		}
	}
	
	static {
		createAFreeAccount2 = createAFreeAccount;
		Z = null;
		jb = rf.a(40, " )2> <col=ffffff>");
		qb = new int[128];
	}
}
