final class rf extends vd {
	
	static int anInt_o;
	static int p;
	int anInt_q;
	static ob sl_back = a(40, "sl_back");
	static int anInt_s;
	static ob t = a(40, "settings");
	static ob u;
	private static ob ob_v = a(40, "blinken1:");
	static int titleJPGValue = -1;
	static int x;
	static int y = -1;
	static bh z;
	private static ob A = a(40, "Schlie-8en");
	static int B;
	private static ob C = a(40, "Could not complete login)3");
	static int E;
	int F;
	static ja G;
	
	static int d(int var0) {
		try {
			if (var0 != 255) {
				a(-91, (String) null);
			}
			
			++p;
			int var1 = ug.a(gf.G, ri.b, (byte) 40, se.d);
			return ~(var1 + -tb.b) > -801 && ~(4 & qe.r[gf.G][ri.b >> 7][se.d >> 7]) != -1 ? gf.G : 3;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "rf.C(" + var0 + ')');
		}
	}
	
	static ob a(int var0, String var1) {
		try {
			++anInt_s;
			byte[] var2 = var1.getBytes();
			int var3 = var2.length;
			int var5 = 0;
			if (var0 != 40) {
				return null;
			} else {
				ob var4 = new ob();
				var4.buffer = new byte[var3];
				
				while (~var5 > ~var3) {
					int var6 = 255 & var2[var5++];
					if (~var6 >= -46 && var6 >= 40) {
						if (var5 >= var3) {
							break;
						}
						
						int var7 = 255 & var2[var5++];
						var4.buffer[var4.length++] = (byte) ((var6 + -40) * 43 + (var7 - 48));
					} else if (~var6 != -1) {
						var4.buffer[var4.length++] = (byte) var6;
					}
				}
				
				var4.i((byte) 108);
				return var4.b((byte) -103);
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "rf.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static void a(byte var0) {
		int var2 = client.anInt_wb;
		
		try {
			v.rb = eb.Y;
			ue.fb = nf.W;
			sc.username_2 = ef.eb;
			md.a = md.g;
			ca.pleaseTryUsingADifferentWorld7 = ub.h;
			qa.E = ng.E;
			de.h = je.R;
			v.D = eh.ab;
			ue.X = ia.bb;
			sb.createAFreeAccount2 = ja.d;
			sh.enterYourUsernamePassword2 = ge.Z;
			fh.o = se.f;
			if (var0 < 44) {
				b((byte) -82);
			}
			
			ca.pleaseTryUsingADifferentWorld2 = vc.n;
			sc.loadingPleaseWait2 = vf.x;
			hi.y = ed.i;
			hi.f = ic.Y;
			wg.R = ra.ec;
			qi.r = hi.o;
			ic.Z = jb.mb;
			jb.ob = rc.s;
			wf.d = ef.bb;
			gi.goBackToTheMainRuneScapeWebpage2 = ua.h;
			af.newUser2 = uc.kb;
			fh.h = fg.u;
			v.P = ph.d;
			je.andChooseTheCreateAccount2 = ed.ob_c;
			a.loadingWordpack2 = th.R;
			u = ob.cb;
			mf.toCreateANewAccountYouNeedTo2 = lf.x;
			dd.c = q.V;
			ua.c = id.u;
			re.s = ki.b;
			v.kb = eh.ab;
			ab.yourAccountIsAlreadyLoggedIn2 = ji.I;
			ia.X = rg.B;
			ki.t = va.f;
			ic.runescapeIsLoadingPleaseWait2 = qg.ob_l;
			qe.p = mf.jb;
			v.ab = eh.ab;
			ab.unexpectedServerResponse2 = ua.r;
			ji.B = rh.n;
			hf.x = wc.N;
			ca.rb = fc.Cb;
			v.ob_nb = vb.a;
			ue.S = qg.k;
			v.E = eh.ab;
			g.Y = A;
			ih.d = ic.V;
			hf.started3DLibrary2 = ci.v;
			v.bb = eh.ab;
			tb.pleaseRemove3 = rc.ob_l;
			eh.X = bi.e;
			pc.loadingSprites2 = ka.F;
			bg.ob_c = wf.k;
			qb.M = me.h;
			mg.loadingInterfaces2 = kf.g;
			le.hb = ua.n;
			dc.h = a.h;
			ng.z = tf.i;
			ba.loginServerOffline2 = gh.kb;
			le.password_2 = m.w;
			cd.startingGameEngine2 = ng.A;
			wg.loadingTextures2 = sa.j;
			v.vb = eh.ab;
			ag.a = v.yb;
			a.buttonNearTheTopOfThatPage2 = ra.u;
			ug.q = kg.p;
			ig.b = rg.ob_o;
			uc.hasLoggedIn2 = jc.db;
			v.Z = gi.z;
			le.V = eh.ab;
			ea.cancel2 = o.ob_e;
			tb.pleaseRemove2 = rc.ob_l;
			ic.D = jb.mb;
			mg.d = ud.ob_ec;
			rc.h = na.ob_n;
			pe.cb = sc.e;
			client.ob_kb = de.p;
			v.F = eh.ab;
			di.b = nf.mb;
			ji.loadingFonts2 = me.d;
			v.Ab = eh.ab;
			ld.s = mg.n;
			rc.loadedInputHandler2 = ri.n;
			si.Z = d.E;
			ac.youCantAddYourselfIgnoreList2 = sf.i;
			ta.drop2 = ab.a;
			ff.loadedFonts2 = eh.W;
			rd.L = jf.R;
			jg.c = gh.Q;
			vb.walkHere2 = ge.P;
			nf.loadedWordpack2 = vb.b;
			v.preparedVisibilityMap2 = nc.a;
			gh.S = pc.f;
			og.eb = pe.Z;
			h.zb = ei.D;
			v.hb = eh.ab;
			ae.asItWasUsedToBreakOurRules2 = ji.F;
			v.fb = eh.ab;
			v.T = eh.ab;
			ni.W = la.p;
			client.S = ob_v;
			fi.take2 = s.U;
			fi.w = ie.E;
			ae.loadedInterfaces2 = oh.F;
			wc.M = ob.S;
			ig.k = rg.ob_o;
			v.S = ri.f;
			g.isAlreadyOnYourFriendList2 = ni.lb;
			v.qb = vb.a;
			v.L = eh.ab;
			ri.hidden2 = gb.ab;
			c.loadedConfig2 = ta.bb;
			hf.B = da.zb;
			se.a = wd.r;
			v.U = ri.f;
			mf.ib = fi.r;
			jh.d = lb.gb;
			g.N = de.c;
			eh.cb = jg.q;
			hf.b = s.V;
			client.ob_hb = gf.s;
			hb.s = da.T;
			jb.fb = hi.E;
			pi.d = tg.r;
			ca.qb = fc.Cb;
			gb.cb = ve.ob_d;
			ci.loadingConfig2 = la.t;
			v.J = eh.ab;
			id.E = m.z;
			ee.loadedSprites2 = mi.R;
			v.G = eh.ab;
			ag.j = ni.mb;
			ga.l = gh.tb;
			qh.j = ca.Eb;
			v.pb = gb.U;
			n.i = de.k;
			v.Y = eh.ab;
			qg.d = uc.Y;
			v.R = eh.ab;
			ca.pleaseTryUsingADifferentWorld6 = vc.n;
			fg.e = hg.b;
			kf.h = rd.Q;
			id.x = ga.u;
			kg.m = ag.r;
			fb.youHaveOnlyJustLeftAnotherWorld2 = ac.C;
			ib.c = ih.t;
			v.mb = ki.q;
			v.sb = vc.n;
			ni.welcomeToRuneScape2 = ah.v;
			b.chooseOption2 = mi.Y;
			sa.h = sf.k;
			e.i = bf.T;
			v.K = kf.k;
			ag.preparedSoundEngine2 = od.V;
			gh.U = qf.P;
			wc.youCantAddYourselfFriendsList2 = ub.f;
			ca.pleaseTryUsingADifferentWorld3 = vc.n;
			je.W = bd.G;
			v.V = eh.ab;
			tg.k = se.k;
			dh.p = ve.ob_g;
			dd.membersObject2 = c.U;
			je.S = md.s;
			qa.hasLoggedOut2 = tg.g;
			oe.u = qb.L;
			ch.attack2 = od.gb;
			dd.ob_g = q.V;
			v.H = eh.ab;
			fi.world2 = ie.E;
			v.db = eh.ab;
			ef.ob_fb = sc.d;
			v.lb = ka.A;
			a.starting3DLibrary2 = bf.S;
			ug.x = bd.H;
			qc.C = ji.H;
			v.eb = eh.ab;
			hi.loadedUpdateList2 = dh.n;
			jb.loadedTextures2 = ic.I;
			oe.n = cd.m;
			ca.pleaseTryUsingADifferentWorld4 = ub.h;
			me.checkingForUpdates2 = ka.C;
			la.clickToSwitch2 = e.j;
			++anInt_o;
			ae.Yb = jb.V;
			v.Q = bc.U;
			ng.connectingToUpdateServer2 = df.A;
			kd.gb = cf.bb;
			ca.pleaseTryUsingADifferentWorld5 = client.ob_sb;
			ud.X = wh.h;
			id.loadingTitleScreen2 = ta.X;
			vg.db = id.r;
			v.wb = kd.Y;
			jb.existingUser2 = dd.f;
			wf.wishesToTradeWithYou2 = hc.e;
			qd.I = pa.b;
			v.gb = eh.ab;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "rf.D(" + var0 + ')');
		}
		
		if (na.N != 0) {
			++var2;
			client.anInt_wb = var2;
		}
		
	}
	
	public static void b(byte var0) {
		try {
			A = null;
			z = null;
			if (var0 <= 48) {
				y = -30;
			}
			
			u = null;
			C = null;
			sl_back = null;
			t = null;
			ob_v = null;
			G = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "rf.B(" + var0 + ')');
		}
	}
	
	rf(int var1, int var2) {
		try {
			this.anInt_q = var1;
			this.F = var2;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "rf.<init>(" + var1 + ',' + var2 + ')');
		}
	}
	
	static fc b(int var0, int var1) {
		try {
			++E;
			fc var2 = (fc) v.W.a((long) var1, (byte) -71);
			if (var0 != -14098) {
				G = null;
			}
			
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = hg.cacheFile16.a((byte) 84, aa.a((byte) 39, var1), g.b(128, (int) var1));
				var2 = new fc();
				var2.N = var1;
				if (var3 != null) {
					var2.a(45, new og(var3));
				}
				
				var2.c((byte) 64);
				if (var2.eb) {
					var2.ub = 0;
					var2.V = false;
				}
				
				v.W.a(var2, (byte) -50, (long) var1);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "rf.E(" + var0 + ',' + var1 + ')');
		}
	}
	
	static {
		u = C;
	}
}
