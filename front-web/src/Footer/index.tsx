import "./style.css";
import { ReactComponent as GitHubIcon } from "./github.svg";
import { ReactComponent as LinkedinIcon } from "./linkedin.svg";

function Footer() {
  return (
    <footer className="main-footer">
      App desenvolvido por Kennedy Aquino
      <div className="footer-icons">
        <a href="https://www.linkedin.com/in/kennedy-aquino-b8a70a1b2" target="_new">
          <LinkedinIcon />
        </a>
        <a href="https://www.github.com/kennedyaquino" target="_new">
          <GitHubIcon />
        </a>
      </div>
    </footer>
  );
}

export default Footer;
