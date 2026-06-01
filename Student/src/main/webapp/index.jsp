<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Portal — Welcome</title>
    <link href="https://fonts.googleapis.com/css2?family=Baloo+2:wght@400;600;700;800&family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
    <style>

        :root {
            --teal:    #0fcfb0;
            --coral:   #ff6b6b;
            --yellow:  #ffd93d;
            --indigo:  #4f46e5;
            --purple:  #a855f7;
            --white:   #ffffff;
            --dark:    #0d1117;
        }

        *, *::before, *::after {
            box-sizing: border-box;
            margin: 0; padding: 0;
        }

        html, body {
            height: 100%;
        }

        body {
            font-family: 'Poppins', sans-serif;
            background: var(--dark);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            overflow: hidden;
            position: relative;
        }

        /* ── Animated mesh background ── */
        .bg-mesh {
            position: fixed;
            inset: 0;
            background:
                radial-gradient(ellipse 80% 60% at 10% 20%,  rgba(15,207,176,.25) 0%, transparent 60%),
                radial-gradient(ellipse 60% 70% at 90% 80%,  rgba(255,107,107,.22) 0%, transparent 55%),
                radial-gradient(ellipse 50% 50% at 50% 10%,  rgba(255,217,61,.15) 0%, transparent 60%),
                radial-gradient(ellipse 70% 60% at 75% 40%,  rgba(79,70,229,.2)   0%, transparent 55%);
            animation: meshPulse 12s ease-in-out infinite alternate;
            z-index: 0;
        }
        @keyframes meshPulse {
            0%   { opacity: .7; transform: scale(1) rotate(0deg); }
            100% { opacity: 1;  transform: scale(1.08) rotate(1.5deg); }
        }

        /* ── Grid dots overlay ── */
        .bg-dots {
            position: fixed;
            inset: 0;
            background-image: radial-gradient(rgba(255,255,255,.07) 1px, transparent 1px);
            background-size: 32px 32px;
            z-index: 0;
        }

        /* ── Floating orbs ── */
        .orb {
            position: fixed;
            border-radius: 50%;
            filter: blur(2px);
            opacity: .55;
            animation: orbFloat ease-in-out infinite alternate;
            z-index: 0;
            pointer-events: none;
        }
        @keyframes orbFloat {
            from { transform: translateY(0) scale(1); }
            to   { transform: translateY(-40px) scale(1.08); }
        }

        /* ── Stars / sparkles ── */
        .star {
            position: fixed;
            width: 6px; height: 6px;
            border-radius: 50%;
            background: white;
            opacity: 0;
            animation: twinkle ease-in-out infinite;
            z-index: 0;
        }
        @keyframes twinkle {
            0%, 100% { opacity: 0; transform: scale(.5); }
            50%       { opacity: .8; transform: scale(1.4); }
        }

        /* ── Card ── */
        .card {
            position: relative;
            z-index: 10;
            background: rgba(255,255,255,.05);
            backdrop-filter: blur(28px);
            -webkit-backdrop-filter: blur(28px);
            border: 1px solid rgba(255,255,255,.12);
            border-radius: 32px;
            padding: 60px 56px 52px;
            max-width: 560px;
            width: 90%;
            text-align: center;
            box-shadow:
                0 32px 80px rgba(0,0,0,.45),
                0 0 0 1px rgba(255,255,255,.06) inset,
                0 1px 0 rgba(255,255,255,.2) inset;
            animation: cardIn .8s cubic-bezier(.34,1.56,.64,1) both;
        }
        @keyframes cardIn {
            from { opacity: 0; transform: translateY(50px) scale(.92); }
            to   { opacity: 1; transform: translateY(0)    scale(1);   }
        }

        /* Top rainbow glow bar */
        .card::before {
            content: '';
            position: absolute;
            top: -2px; left: 20%; right: 20%;
            height: 3px;
            border-radius: 100px;
            background: linear-gradient(90deg, var(--teal), var(--yellow), var(--coral), var(--purple));
            filter: blur(1px);
        }

        /* ── Badge ── */
        .badge {
            display: inline-flex;
            align-items: center;
            gap: 6px;
            background: rgba(15,207,176,.15);
            border: 1px solid rgba(15,207,176,.35);
            color: var(--teal);
            font-size: .72rem;
            font-weight: 600;
            letter-spacing: .1em;
            text-transform: uppercase;
            padding: 5px 14px;
            border-radius: 100px;
            margin-bottom: 24px;
            animation: cardIn .6s ease .1s both;
        }
        .badge-dot {
            width: 7px; height: 7px;
            border-radius: 50%;
            background: var(--teal);
            animation: blink 1.4s ease-in-out infinite;
        }
        @keyframes blink {
            0%, 100% { opacity: 1; }
            50%       { opacity: .2; }
        }

        /* ── Heading ── */
        h1 {
            font-family: 'Baloo 2', cursive;
            font-weight: 800;
            font-size: clamp(2rem, 5vw, 2.9rem);
            line-height: 1.15;
            color: var(--white);
            margin-bottom: 12px;
            animation: cardIn .6s ease .2s both;
        }
        h1 .highlight-teal   { color: var(--teal); }
        h1 .highlight-coral  { color: var(--coral); }
        h1 .highlight-yellow { color: var(--yellow); }

        /* ── Subtext ── */
        .sub {
            color: rgba(255,255,255,.55);
            font-size: .92rem;
            font-weight: 300;
            line-height: 1.7;
            margin-bottom: 40px;
            animation: cardIn .6s ease .3s both;
        }

        /* ── Stats row ── */
        .stats {
            display: flex;
            justify-content: center;
            gap: 28px;
            margin-bottom: 40px;
            animation: cardIn .6s ease .35s both;
        }
        .stat {
            text-align: center;
        }
        .stat-num {
            font-family: 'Baloo 2', cursive;
            font-weight: 800;
            font-size: 1.5rem;
            line-height: 1;
        }
        .stat-num.c1 { color: var(--teal);   }
        .stat-num.c2 { color: var(--yellow);  }
        .stat-num.c3 { color: var(--coral);   }
        .stat-label {
            color: rgba(255,255,255,.4);
            font-size: .7rem;
            font-weight: 500;
            letter-spacing: .06em;
            text-transform: uppercase;
            margin-top: 2px;
        }
        .stat-divider {
            width: 1px;
            background: rgba(255,255,255,.12);
            align-self: stretch;
        }

        /* ── CTA Button ── */
        .btn-login {
            display: inline-flex;
            align-items: center;
            justify-content: center;
            gap: 10px;
            text-decoration: none;
            font-family: 'Baloo 2', cursive;
            font-weight: 700;
            font-size: 1.05rem;
            letter-spacing: .03em;
            color: var(--dark);
            background: linear-gradient(135deg, var(--teal) 0%, var(--yellow) 100%);
            padding: 15px 42px;
            border-radius: 100px;
            box-shadow:
                0 8px 30px rgba(15,207,176,.4),
                0 2px 8px rgba(0,0,0,.3);
            transition: transform .2s, box-shadow .2s, filter .2s;
            animation: cardIn .6s ease .45s both;
            position: relative;
            overflow: hidden;
        }
        .btn-login::after {
            content: '';
            position: absolute;
            inset: 0;
            background: linear-gradient(135deg, rgba(255,255,255,.3), transparent);
            border-radius: inherit;
        }
        .btn-login:hover {
            transform: translateY(-3px) scale(1.03);
            box-shadow:
                0 16px 40px rgba(15,207,176,.5),
                0 4px 12px rgba(0,0,0,.3);
            filter: brightness(1.08);
        }
        .btn-login:active {
            transform: scale(.97);
        }
        .btn-arrow {
            font-size: 1.2rem;
            transition: transform .2s;
        }
        .btn-login:hover .btn-arrow {
            transform: translateX(4px);
        }

        /* ── Footer note ── */
        .footer-note {
            margin-top: 22px;
            color: rgba(255,255,255,.3);
            font-size: .75rem;
            animation: cardIn .6s ease .5s both;
        }
        .footer-note a {
            color: rgba(255,255,255,.55);
            text-decoration: none;
            font-weight: 500;
            border-bottom: 1px dashed rgba(255,255,255,.3);
            transition: color .2s;
        }
        .footer-note a:hover { color: var(--teal); border-color: var(--teal); }

    </style>
</head>
<body>

<!-- Background layers -->
<div class="bg-mesh"></div>
<div class="bg-dots"></div>

<!-- Orbs -->
<div class="orb" style="width:220px;height:220px;background:radial-gradient(circle,rgba(15,207,176,.5),transparent 70%);top:-60px;left:-60px;animation-duration:7s;"></div>
<div class="orb" style="width:180px;height:180px;background:radial-gradient(circle,rgba(255,107,107,.45),transparent 70%);bottom:-40px;right:-40px;animation-duration:9s;animation-delay:.5s;"></div>
<div class="orb" style="width:130px;height:130px;background:radial-gradient(circle,rgba(255,217,61,.4),transparent 70%);top:30%;right:8%;animation-duration:6s;animation-delay:1s;"></div>
<div class="orb" style="width:100px;height:100px;background:radial-gradient(circle,rgba(168,85,247,.45),transparent 70%);bottom:20%;left:6%;animation-duration:8s;animation-delay:2s;"></div>

<!-- Sparkles -->
<div class="star" style="top:15%;left:12%;animation-duration:2.2s;animation-delay:.3s;"></div>
<div class="star" style="top:22%;right:18%;animation-duration:3s;animation-delay:1s;background:var(--yellow);"></div>
<div class="star" style="bottom:25%;left:20%;animation-duration:2.6s;animation-delay:1.7s;background:var(--teal);"></div>
<div class="star" style="bottom:30%;right:14%;animation-duration:1.9s;animation-delay:.7s;background:var(--coral);"></div>
<div class="star" style="top:45%;left:5%;animation-duration:2.8s;animation-delay:2.3s;"></div>
<div class="star" style="top:60%;right:6%;animation-duration:2.4s;animation-delay:1.4s;background:var(--purple);"></div>

<!-- Main Card -->
<div class="card">

    <div class="badge">
        <div class="badge-dot"></div>
        Portal Live
    </div>

    <h1>
        Welcome to<br>
        <span class="highlight-teal">Stu</span><span class="highlight-coral">dent</span>
        <span class="highlight-yellow">Hub</span> 🎓
    </h1>

    <p class="sub">
        Your all-in-one academic companion.<br>
        Learn, connect, and grow every day.
    </p>

    <div class="stats">
        <div class="stat">
            <div class="stat-num c1">1.2k+</div>
            <div class="stat-label">Students</div>
        </div>
        <div class="stat-divider"></div>
        <div class="stat">
            <div class="stat-num c2">48</div>
            <div class="stat-label">Courses</div>
        </div>
        <div class="stat-divider"></div>
        <div class="stat">
            <div class="stat-num c3">98%</div>
            <div class="stat-label">Success</div>
        </div>
    </div>

    <a href="login" class="btn-login">
        Login Here
        <span class="btn-arrow">→</span>
    </a>

    <p class="footer-note">
        New here? <a href="register">Create a free account</a>
    </p>

</div>

</body>
</html>