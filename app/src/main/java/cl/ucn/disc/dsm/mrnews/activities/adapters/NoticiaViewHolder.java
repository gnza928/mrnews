/*
 * @author Gonzalo Nieto Berríos
 */

package cl.ucn.disc.dsm.mrnews.activities.adapters;

import androidx.recyclerview.widget.RecyclerView;
import cl.ucn.disc.dsm.mrnews.R;
import cl.ucn.disc.dsm.mrnews.databinding.RowNoticiaBinding;
import cl.ucn.disc.dsm.mrnews.model.Noticia;
import java.util.Date;
import org.ocpsoft.prettytime.PrettyTime;
import org.threeten.bp.DateTimeUtils;

public final class NoticiaViewHolder extends RecyclerView.ViewHolder {

  /**
   * The Bindings
   */
  private final RowNoticiaBinding binding;

  /**
   * The Date formatter
   */
  private static final PrettyTime PRETTY_TIME = new PrettyTime();

  /**
   * The Constructor.
   *
   * @param rowNoticiaBinding to use.
   */
  public NoticiaViewHolder(RowNoticiaBinding rowNoticiaBinding) {
    super(rowNoticiaBinding.getRoot());
    this.binding = rowNoticiaBinding;
  }

  /**
   * Bind the Noticia to the ViewHolder.
   *
   * @param noticia to bind.
   */
  public void bind(final Noticia noticia) {

    this.binding.tvTitulo.setText(noticia.getTitulo());
    this.binding.tvResumen.setText(noticia.getResumen());
    this.binding.tvAutor.setText(noticia.getAutor());
    this.binding.tvFuente.setText(noticia.getFuente());

    // FIXME: The format of the date.
    this.binding.tvFecha.setText(noticia.getFecha().toString());

    // If exist the url ..
    if (noticia.getUrlFoto() != null) {
      // .. set the uri
      this.binding.sdvFoto.setImageURI(noticia.getUrlFoto());
    } else {
      // .. set a default image
      this.binding.sdvFoto.setImageResource(R.drawable.ic_launcher_background);
    }

    // ZonedDateTime to Date
    final Date date = DateTimeUtils.toDate(noticia.getFecha().toInstant());
    this.binding.tvFecha.setText(PRETTY_TIME.format(date));

  }

}

