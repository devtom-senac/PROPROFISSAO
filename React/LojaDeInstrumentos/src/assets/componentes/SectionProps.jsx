import styles from "../CSS/SectionProps.module.css";

function Section({ conteudo1, conteudo2, className1, className2 }) {
  return (
    <section className={styles.section}>
      <section className={styles.sectionVermelha}>
        <div className={`${styles.caixa} ${className1}`}>{conteudo1}</div>
        <div className={`${styles.caixa} ${className2}`}>{conteudo2}</div>
      </section>
    </section>
  );
}

export default Section;
